package com.giuseppescaffidi.protesmetadatabe.repository;

import com.giuseppescaffidi.protesmetadatabe.model.entities.mongodb.ActivityDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface ActivityRepository extends MongoRepository<ActivityDocument, String> {
}
