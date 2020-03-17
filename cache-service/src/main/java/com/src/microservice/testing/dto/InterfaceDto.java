package com.src.microservice.testing.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class InterfaceDto {
	private Long id;
    private String name;
    private LocalDateTime createdAt;
}
