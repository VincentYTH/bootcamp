package com.bootcamp.demo.demo_sb_dto.dto.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_sb_dto.dto.StockDTO;
import com.bootcamp.demo.demo_sb_dto.model.Stock;

@Component // bean
// @Controller: work with @GetMapping, @PostMapping etc.
// @Service: just representing the class is a service layer
// @Configuration: always used in some classes in the config folder
// @Repository: collect to the DataBase by JPA framwork
public class StockMapper {
  
  public StockDTO mapToStockDTO(Stock stock){
    return StockDTO.builder()
            .stockNo(stock.getId())
            .quantity(stock.getQuantity())
            .build();
  }
}
