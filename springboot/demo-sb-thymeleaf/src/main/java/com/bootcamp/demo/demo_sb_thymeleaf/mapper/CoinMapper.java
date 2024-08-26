package com.bootcamp.demo.demo_sb_thymeleaf.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_sb_thymeleaf.dto.CoinDTO;
import com.bootcamp.demo.demo_sb_thymeleaf.model.ExCoin;

@Component
public class CoinMapper {
  
  public CoinDTO mapToCoin(ExCoin exCoin){
    CoinDTO coinDTO = new CoinDTO();
    coinDTO.setCurrentPrice(exCoin.getCurrentPrice());
    coinDTO.setId(exCoin.getId());
    coinDTO.setImage(exCoin.getImage());
    coinDTO.setLastUpdated(exCoin.getLastUpdated().split("T")[0]);
    return coinDTO;
  }
}
