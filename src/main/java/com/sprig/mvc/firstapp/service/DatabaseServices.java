package com.sprig.mvc.firstapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sprig.mvc.firstapp.entity.Database;
import com.sprig.mvc.firstapp.utils.RandomRaise;

import org.springframework.stereotype.Service;

@Service
public class DatabaseServices {

    private static List<Database> datas = new ArrayList<Database>(){
        {
           add(new Database(RandomRaise.getRandom(1000, 9999), "001", "dildo", 20.000));
           add(new Database(RandomRaise.getRandom(1000, 9999), "002", "keybord", 30.000));
           add(new Database(RandomRaise.getRandom(1000, 9999), "003", "monitor", 40.000));
           add(new Database(RandomRaise.getRandom(1000, 9999), "004", "cpu", 50.000));
        }
    };
    
    public List<Database> findAll(){
        return datas;
    }
    public void save(Database database){
        database.setId(RandomRaise.getRandom(1000, 9999));
        datas.add(database);
    }

    public void deleteById(long id){
        // sintax lambda atau anonymous function
        datas.removeIf(arg -> arg.getId() == id);

        // sintax biasa
        // for (int i = 0; i < datas.size(); i++) {
        //     if(datas.get(i).getId() == id){
        //         System.out.println(datas.get(i).getName());
        //         datas.remove(i);
        //     }
        // }
    }

    public Optional<Database> findById(long id) {
        return datas.stream().filter(arg -> arg.getId() == id).findFirst();
    }
    
}
