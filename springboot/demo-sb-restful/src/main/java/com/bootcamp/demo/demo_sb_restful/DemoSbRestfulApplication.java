package com.bootcamp.demo.demo_sb_restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSbRestfulApplication {

	public static void main(String[] args) {
		// Try to find a bean can be @Autowird te CommandLineRunner (Interface)
		// bean.run(); -> one of the processes of lication.run()
		SpringApplication.run(DemoSbRestfulApplication.class, args);

		// double x = 10.0 / 3.0;
		// System.out.println(x); // 3.3333333333333335

		// double y = 
		// BigDecimal.valueOf(10.0)
		// 	.divide(BigDecimal.valueOf(3.0), 4, RoundingMode.HALF_UP)
		// 	.doubleValue();
		// System.out.println(y); // 3.3333
	}
}
