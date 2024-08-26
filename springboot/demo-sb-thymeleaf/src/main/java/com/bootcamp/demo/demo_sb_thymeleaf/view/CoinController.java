package com.bootcamp.demo.demo_sb_thymeleaf.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demo_sb_thymeleaf.service.ApiService;

@Controller
public class CoinController {
  
  @Autowired
  private ApiService apiService;

  @GetMapping(value = "/coin-data")
  public String displayCoinData(Model model){
    model.addAttribute("coinDataList", apiService.fetchCoinData());
    return "coin-data";
  }
}
