package com.example.controller;

import com.example.dao.DataAccessFacade;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pradeep on 05-08-2016.
 */
public abstract class BaseController {

    @Autowired
    protected DataAccessFacade daf;
}
