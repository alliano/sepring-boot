package com.sprig.mvc.firstapp.service;

import java.util.Optional;
import com.sprig.mvc.firstapp.entity.Database;
import com.sprig.mvc.firstapp.repository.DatabaseRepository;

import org.springframework.stereotype.Service;

@Service
public class DatabaseServices {

    private DatabaseRepository repository;

    public Iterable<Database> findAll(){
        return repository.findAll();
    }
    public void save(Database database){
       repository.save(database);
    }

    public void deleteById(long id){
        repository.deleteById(id);

        // sintax lambda atau anonymous function
        // datas.removeIf(arg -> arg.getId() == id);
        // sintax biasa
        // for (int i = 0; i < datas.size(); i++) {
        //     if(datas.get(i).getId() == id){
        //         System.out.println(datas.get(i).getName());
        //         datas.remove(i);
        //     }
        // }
    }

    public Optional<Database> findById(long id) {
        return repository.findById(id);
        // return datas.stream().filter(arg -> arg.getId() == id).findFirst();
    }

    public void Update(Database database){
        repository.save(database);
    }
    
}
