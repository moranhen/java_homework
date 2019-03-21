package com.edu.tju.moyan;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InStream {
    public String readin(String filePath){
        File file = new File(filePath);
        StringBuffer sb =new StringBuffer();
        try{
            InputStream is = new FileInputStream(file);
            byte data[] = new byte[1000001];
            int lenth = is.read(data);
            String str = new String(data,0,lenth);
            char temp[] =str.toCharArray();
            for(char i :temp){
                if(i==' '|| (i>='a'&&i<='z')||(i>='A'&&i<='Z')){
                    sb.append(i);
                }else if((i>=33&&i<=47) && i!=45 ){
                    sb.append(' ');
                }
            }
        }catch(Exception exception){
            exception.printStackTrace();
        }
        return sb.toString().toLowerCase();
    }

}
