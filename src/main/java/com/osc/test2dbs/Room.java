package com.osc.test2dbs;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rooms")
@Data
public class Room {
    @Id
    private String id;
    private int size;
    private int roomNumber;
    private boolean occupied;
}
