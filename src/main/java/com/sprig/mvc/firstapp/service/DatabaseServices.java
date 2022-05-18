package com.sprig.mvc.firstapp.service;

import java.util.ArrayList;
import java.util.List;

import com.sprig.mvc.firstapp.entity.Database;
import org.springframework.stereotype.Service;

@Service
public class DatabaseServices {

    private static List<Database> datas = new ArrayList<Database>(){
        {
           add(new Database(System.currentTimeMillis(), "001", "dildo", 20.000));
           add(new Database(System.currentTimeMillis(), "002", "keybord", 30.000));
           add(new Database(System.currentTimeMillis(), "003", "monitor", 40.000));
           add(new Database(System.currentTimeMillis(), "004", "cpu", 50.000));
        }
    };
    
    public List<Database> findAll(){
        return datas;
    }
    public void save(Database database){
        database.setId(System.currentTimeMillis());
        datas.add(database);
    }

    
}
