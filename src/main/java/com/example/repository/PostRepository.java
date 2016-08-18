package com.example.repository;

import com.example.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by pradeep on 08-06-2016.
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Long>{

}
