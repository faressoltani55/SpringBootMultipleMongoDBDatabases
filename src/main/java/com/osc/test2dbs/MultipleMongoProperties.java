package com.osc.test2dbs;

import lombok.Data;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="mongodb")
public class MultipleMongoProperties {
    private MongoProperties central = new MongoProperties();
    private MongoProperties local = new MongoProperties();
}
