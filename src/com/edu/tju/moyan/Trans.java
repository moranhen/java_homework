package com.edu.tju.moyan;

import java.util.*;

public class Trans {

    public Map<String,Integer> getMap(String str){
        String temp[] = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String s:temp){
            if(map.containsKey(s)){
                int i= map.get(s)+1;
                map.put(s,i);
            }else {
                map.put(s,1);
            }
        }
        return map;
    }
    public List<Map.Entry<String,Integer>> getOrder(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        list.remove(0);
        return list;
    }
}
