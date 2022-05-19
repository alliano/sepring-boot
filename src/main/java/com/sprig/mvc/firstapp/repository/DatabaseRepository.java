package com.sprig.mvc.firstapp.repository;

import com.sprig.mvc.firstapp.entity.Database;

import org.springframework.data.repository.CrudRepository;

public interface DatabaseRepository extends CrudRepository<Database,Long> {
    
}
