package com.osc.test2dbs;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SuperUsers")
@Data
public class SuperUser {
    @Id
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
