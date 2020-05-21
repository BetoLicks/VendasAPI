package com.vendasapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name = "nomeApi")
	public String nomeApi() {
		return "Sistema de vendas";
	}
}
