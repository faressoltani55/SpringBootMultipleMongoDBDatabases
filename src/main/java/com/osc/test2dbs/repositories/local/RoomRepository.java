package com.osc.test2dbs.repositories.local;

import com.osc.test2dbs.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room,String> {
}
