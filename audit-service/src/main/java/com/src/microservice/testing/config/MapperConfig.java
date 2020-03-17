package com.src.microservice.testing.config;

import com.src.microservice.testing.dto.UpdateAuditDto;
import com.src.microservice.testing.model.Audit;
import com.src.microservice.testing.service.AuditService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Configuration
public class MapperConfig {
	private final AuditService auditService;

	public MapperConfig(AuditService auditService) {
		this.auditService = auditService;
	}
	
	@Bean
	MapperFactory mapperFactory() {
		DefaultMapperFactory defaultMapperFactory = new DefaultMapperFactory.Builder().useAutoMapping(true).build();
		
		//Audit
		defaultMapperFactory.classMap(UpdateAuditDto.class, Audit.class).mapNulls(false).byDefault().register();
		
		return defaultMapperFactory;
	}
	
	@Bean
	MapperFacade mapperFacade() {
		return mapperFactory().getMapperFacade();
	}
}