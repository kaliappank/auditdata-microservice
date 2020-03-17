package com.src.microservice.testing.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AuditDto {
	private Long audit_id;
    private String status;
    private LocalDateTime created_ts;
}
