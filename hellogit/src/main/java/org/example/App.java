package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Hello Git!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("Hello World!");

        Set<Long> set = new HashSet<>();
        List<Long> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(Long.valueOf(i));
            list.add(Long.valueOf(i));
        }
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }

        set.forEach(new Consumer<Long>() {
            @Override
            public void accept(Long aLong) {
                System.out.println(aLong);
            }
        });


    }
}
