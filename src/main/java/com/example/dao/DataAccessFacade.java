package com.example.dao;

import com.example.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

/**
 * Created by pradeep on 05-08-2016.
 */
@Service
public interface DataAccessFacade {

    public abstract PostDao getPostDao();

    public void setPostDao(PostDao postDao);
}
