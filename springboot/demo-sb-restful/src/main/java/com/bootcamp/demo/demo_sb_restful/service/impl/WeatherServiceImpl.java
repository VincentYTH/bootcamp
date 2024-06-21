package com.bootcamp.demo.demo_sb_restful.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo.demo_sb_restful.dto.WeatherDTO;
import com.bootcamp.demo.demo_sb_restful.infra.Scheme;
import com.bootcamp.demo.demo_sb_restful.infra.UrlBuilder;
import com.bootcamp.demo.demo_sb_restful.model.dto.ExOpenDataDTO;
import com.bootcamp.demo.demo_sb_restful.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

  // @Value("${'${api.weather.open-data.request-params}'.split(',')}")
  // private List<String> openDataRequestParams;

  @Value(value = "${api.weather.domain}")
  private String domain;

  @Value("${api.weather.base-paths}")
  private String[] basePaths;

  @Value(value = "${api.weather.open-data.endpoint}")
  private String openDataEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  @Qualifier(value = "stations")
  private List<String> stations;

  @Autowired
  @Qualifier(value = "dataTypes")
  private List<String> dataTypes;

  @Override
  public Map<String, Map<LocalDate, List<WeatherDTO>>> getWeathers() {
    Map<String, Map<LocalDate, List<WeatherDTO>>> stationMap = new HashMap<>();
    for (String dataType : dataTypes) {
      getWeathers(dataType, stations, stationMap);
    }
    return stationMap;
  }

  private void getWeathers(String dataType, List<String> stations,
      Map<String, Map<LocalDate, List<WeatherDTO>>> stationMap) {

    Map<LocalDate, List<WeatherDTO>> dateMap = new HashMap<>();
    ExOpenDataDTO exDto = null;

    for (String station : stations) {
      exDto = this.getWeathers(dataType, station);
      for (List<String> w : exDto.getData()) {
        // Construct date value
        LocalDate date = LocalDate.of(Integer.valueOf(w.get(0)),
            Integer.valueOf(w.get(1)), Integer.valueOf(w.get(2)));
        // construct weather
        WeatherDTO wDTO =
            new WeatherDTO(dataType, w.get(3), w.get(4));

        if (stationMap.containsKey(station)) {
          dateMap = stationMap.get(station);
          if (dateMap.containsKey(date)) {
            dateMap.get(date).add(wDTO);
          } else {
            dateMap.put(date, new ArrayList<>(List.of(wDTO)));
          }
        } else {
          dateMap = new HashMap<>();
          dateMap.put(date, new ArrayList<>(List.of(wDTO)));
          stationMap.put(station, dateMap);
        }
      }
    }
  }

  private ExOpenDataDTO getWeathers(String dataType, String station) {
    MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
    params.add("dataType", dataType);
    params.add("rformat", "json");
    params.add("station", station);
    String url = UrlBuilder.get(Scheme.HTTPS, domain, openDataEndpoint,
        basePaths, params);
    System.out.println("url=" + url);
    return restTemplate.getForObject(url, ExOpenDataDTO.class);
  }
}