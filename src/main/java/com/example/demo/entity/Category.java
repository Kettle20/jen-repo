package com.example.demo.entity;

import org.hibernate.envers.Audited;

import com.example.demo.config.AuditBase;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Audited
public class Category extends AuditBase  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true) //validation
	private String name;
	
	
	
	
}
