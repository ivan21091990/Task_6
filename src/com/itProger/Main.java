package com.itProger;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        String textOutput;
        ArrayList<String> arrayList= new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("aplana.txt"));

         while ((textOutput = br.readLine()) != null){ {
                System.out.println(textOutput);
                System.out.println();}
                for ( String str: textOutput.split(" ")){
                    arrayList.add(str);
                }
             Collections.sort(arrayList);
                for (String a: arrayList){
                    int i =0;
                    for (String b: arrayList){
                        if (b.equals(a)) i++;
                    }
                    System.out.println(a + "   " + i);
                }


            }




    }
}
