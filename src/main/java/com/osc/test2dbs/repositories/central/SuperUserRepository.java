package com.osc.test2dbs.repositories.central;

import com.osc.test2dbs.SuperUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperUserRepository extends MongoRepository<SuperUser,String> {
}
