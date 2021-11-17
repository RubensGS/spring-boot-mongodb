package com.workshop.demo.repository;

import com.workshop.demo.domain.Post;
import com.workshop.demo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
