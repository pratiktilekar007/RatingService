package com.lcwd.rating.config;

import jakarta.annotation.PostConstruct;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDBChecker {

    private final MongoTemplate mongoTemplate;

    public MongoDBChecker(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @PostConstruct
    public void checkDatabase() {
        System.out.println("======================================");
        System.out.println("MongoDB Database: " +
                mongoTemplate.getDb().getName());
        System.out.println("======================================");
    }
}