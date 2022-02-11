package com.company;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf=new BufferedReader(new FileReader("/home/ayush/IdeaProjects/IPL/src/com/company/matches.csv"));
        String rd;
        ArrayList<String[]>list=new ArrayList<>();
        while((rd=bf.readLine())!=null){
            String[] str=rd.split(",");
            list.add(str);
        }
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.get(i).length;j++)
                System.out.print(list.get(i)[j]+" ");
            System.out.println("");
        }
        bf.close();
    }
}
