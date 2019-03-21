package com.edu.tju.moyan;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String filePath ="了不起的盖茨比(英文版).txt";
        InStream is = new InStream();
        Trans trans =new Trans();
        WriteStream wrs =new WriteStream();
        String temp = is.readin(filePath);
        Map<String,Integer> map = trans.getMap(temp);
        List<Map.Entry<String,Integer>> list = trans.getOrder(map);
        String filePath2="output.txt";
        wrs.writeTo(list,filePath2);
        for(Map.Entry<String,Integer> mapping : list ){
            System.out.println(mapping.getKey()+" "+mapping.getValue());
        }
    }
}
