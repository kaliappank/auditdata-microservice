package com.src.microservice.testing.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class CreateAuditDto {
	@NotBlank
	private String status;
}
