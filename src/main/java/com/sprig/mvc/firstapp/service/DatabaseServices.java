package com.sprig.mvc.firstapp.service;

import java.util.Arrays;
import java.util.List;

import com.sprig.mvc.firstapp.entity.Database;
import org.springframework.stereotype.Service;

@Service
public class DatabaseServices {

    private static List<Database> datas = Arrays.asList(
        new Database(1L, "001", "dildo", 20.000),
        new Database(2L, "002", "keybord", 30.000),
        new Database(3L, "003", "monitor", 40.000),
        new Database(4L, "004", "cpu", 50.000),
        new Database(5L, "005", "ram", 60.000)
    );
    
    public List<Database> findAll(){
        return datas;
    }

    
}
