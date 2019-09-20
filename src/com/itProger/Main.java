package com.itProger;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        String textOutput;
        BufferedReader br = new BufferedReader(new FileReader("aplana.txt"));

        while ((textOutput = br.readLine()) != null) {
            {
                System.out.println("1. " + textOutput);
                List<String> list = Arrays.asList(textOutput.split(" "));
                Collections.sort(list);
                System.out.println("2. " + list);

                Map<String, Integer> map = new HashMap<String, Integer>(list.size());

                for (String str : list) {
                    Integer count = map.get(str);
                    map.put(str, count == null ? 1 : count + 1);
                }
                System.out.println("3. " + map);

                String s = null;
                int p = 0;
                for (String w : map.keySet()) {
                    if (p < map.get(w)) {
                        p = map.get(w);
                        s = w;}
                    }
                System.out.println("4. Самое повторяющееся слово: " + s + " (встречается " + map.get(s) + " раз(а))");
                }
            }
        }
    }
