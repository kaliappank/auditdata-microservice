package com.src.microservice.testing.config;

import com.src.microservice.testing.dto.UpdateInterfaceDto;
import com.src.microservice.testing.model.Interface;
import com.src.microservice.testing.service.InterfaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Configuration
public class MapperConfig {
	private final InterfaceService interfaceService;

	public MapperConfig(InterfaceService interfaceService) {
		this.interfaceService = interfaceService;
	}
	
	@Bean
	MapperFactory mapperFactory() {
		DefaultMapperFactory defaultMapperFactory = new DefaultMapperFactory.Builder().useAutoMapping(true).build();
		
		//Interface
		defaultMapperFactory.classMap(UpdateInterfaceDto.class, Interface.class).mapNulls(false).byDefault().register();
		
		return defaultMapperFactory;
	}
	
	@Bean
	MapperFacade mapperFacade() {
		return mapperFactory().getMapperFacade();
	}
}
