package com.sprig.mvc.firstapp.repository;

import java.util.List;

import com.sprig.mvc.firstapp.entity.Database;

import org.springframework.data.repository.CrudRepository;

public interface DatabaseRepository extends CrudRepository<Database,Long> {
    List<Database> findByNameContains(String key);
}
