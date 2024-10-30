package com.example.demo.config;

import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CustomRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity)
    {
        CustomRevisionEntity entity = (CustomRevisionEntity) revisionEntity;
        
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        
        entity.setAuditor(authentication != null ? authentication.getName() : "Anonymous"); // TODO: fetch user from security context.
    }
}
