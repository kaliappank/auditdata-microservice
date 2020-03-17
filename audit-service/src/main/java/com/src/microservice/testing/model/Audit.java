package com.src.microservice.testing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "audit")
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long audit_id;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private LocalDateTime created_ts;

    @Column(nullable = false)
    private LocalDateTime updated_ts;

    @PrePersist
    public void onPrePersist() {
    	created_ts = updated_ts = LocalDateTime.now();
    }

    @PreUpdate
    public void onPreUpdate() {
    	updated_ts = LocalDateTime.now();
    }

	public void setStatus(String status) {
		this.status = status;
	}
    
    
}