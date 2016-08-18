package com.example.daoImpl;

import com.example.dao.PostDao;
import com.example.entity.Post;
import com.example.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pradeep on 04-08-2016.
 */
@Service
public class PostDaoImpl implements PostDao {


    PostRepository postRepository;

    @Autowired
    public PostDaoImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> retieveAllPosts() {
        //return postRepository.findAll();
        return null;
    }

    @Override
    public Post retievePost(int postId) {
        //return postRepository.
        return null;
    }
}
