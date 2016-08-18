package com.example.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


/**
 * Created by pradeep on 05-08-2016.
 */

public abstract class BaseDao {

    @Autowired
    @Qualifier("datasource")
    protected DataSource dataSource;
}
