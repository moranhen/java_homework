package com.edu.tju.moyan;

import java.io.*;
import java.util.List;
import java.util.Map;

public class WriteStream {
    public void writeTo(List<Map.Entry<String,Integer>> list , String filePath ){
       try {
           File file = new File(filePath);
           Writer wrs = new FileWriter(file);
           StringBuffer sb = new StringBuffer();
           for(Map.Entry<String,Integer> mapping :list){
               String temp =mapping.getKey()+" "+mapping.getValue()+"\n";
               sb.append(temp);
           }
           wrs.write(sb.toString());
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
