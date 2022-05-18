package com.sprig.mvc.firstapp.utils;

public class RandomRaise {

    public static long getRandom(long min,long max){
        long Random = min + (long) (Math.random() * (max-min));
        return Random;
    }
    
}
