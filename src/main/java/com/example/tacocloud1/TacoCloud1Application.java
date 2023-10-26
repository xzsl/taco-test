package com.example.tacocloud1;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Comparator;


@SpringBootApplication
public class TacoCloud1Application {

    public static void main(String[] args) {
        int pageSize = 20;
        System.out.println("my page size is "+pageSize);
        SpringApplication.run(TacoCloud1Application.class, args);
        //File[] files = new File(".").listFiles(File::isHidden);
        File[] files = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
        System.out.println(JSON.toJSONString(files));
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(99);
        integers.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(JSON.toJSON(integers));
    }


}
