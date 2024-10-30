package com.example.demo.config;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@RevisionEntity(CustomRevisionListener.class)
@Table(name = "revision_info")
public class CustomRevisionEntity extends DefaultRevisionEntity {

    private String auditor= "admin";

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

}
