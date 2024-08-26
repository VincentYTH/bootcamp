package com.bootcamp.demo.demo_sb_thymeleaf.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo.demo_sb_thymeleaf.dto.CoinDTO;
import com.bootcamp.demo.demo_sb_thymeleaf.mapper.CoinMapper;
import com.bootcamp.demo.demo_sb_thymeleaf.model.ExCoin;

@Service
public class ApiService {
  
  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private CoinMapper coinMapper;

  public List<CoinDTO> fetchCoinData(){
    String url = "https://api.coingecko.com/api/v3/coins/markets?ids=bitcoin,ethereum,tether&vs_currency=usd";
    ExCoin[] response = restTemplate.getForObject(url, ExCoin[].class);
    List<CoinDTO> coinDTOs = Arrays.asList(response).stream()
      .map(e -> coinMapper.mapToCoin(e))
      .collect(Collectors.toList());
    return coinDTOs;
  }
}
