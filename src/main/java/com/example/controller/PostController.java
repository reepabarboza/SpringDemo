package com.example.controller;

import com.example.dao.PostDao;
import com.example.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pradeep on 04-08-2016.
 */
@Controller
//@RequestMapping("/post")
public class PostController extends BaseController{

    private PostDao postDao;

    @Autowired
    public PostController(PostDao postDao) {
        this.postDao = postDao;
    }

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public String list(){
        System.out.println("Posts");
        return "views/post";
    }


    @RequestMapping(value = "/savePost", method = RequestMethod.POST)
    public String save(Post post) {
        post.setSubject("Pradeep");
        post.setText("Pradeep is awesome!");
        postDao.save(post);
        //daf.getPostDao().save(post);
        System.out.println("saved");
        return "views/submitPost";
    }

    @RequestMapping("/retrievePost")
    public void retrievePosts(Post post) {
        System.out.println("retrieved");
    }
}
