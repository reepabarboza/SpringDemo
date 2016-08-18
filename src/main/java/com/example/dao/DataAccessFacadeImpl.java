package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pradeep on 05-08-2016.
 */
public class DataAccessFacadeImpl implements DataAccessFacade {

    @Autowired
    private PostDao postDao;

    @Override
    public PostDao getPostDao(){
        return postDao;
    }

    @Override
    public void setPostDao(PostDao postDao){
        this.postDao = postDao;
    }
}
