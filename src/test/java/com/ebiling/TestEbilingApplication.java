package com.ebiling;

import org.springframework.boot.SpringApplication;

public class TestEbilingApplication {

	public static void main(String[] args) {
		SpringApplication.from(EbilingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
