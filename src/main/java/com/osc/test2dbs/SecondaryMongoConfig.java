package com.osc.test2dbs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.osc.test2dbs.repositories.local", mongoTemplateRef = "secondaryMongoTemplate")
public class SecondaryMongoConfig {
}
