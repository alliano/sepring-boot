package com.sprig.mvc.firstapp.repository;

import com.sprig.mvc.firstapp.entity.Database;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


// proses query disini
public interface DatabaseRepository extends CrudRepository<Database,Long> {

    List<Database> findByNameContains(String keyword);

}
