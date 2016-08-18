package com.example.dao;

import com.example.entity.Post;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * Created by pradeep on 04-08-2016.
 */
@Service
public interface PostDao {

    public Post save(Post post);

    public List<Post> retieveAllPosts();

    public Post retievePost(int postId);
}
