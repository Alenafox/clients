package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, Integer>> clients = new TreeMap<String, TreeMap <String, Integer>>();
        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            if(str.equals("exit")) {
                break;
            }
            String[] words = str.split(" ");
            String name = words[0];
            String productName = words[1];
            Integer count = Integer.parseInt(words[2]);

            if (!clients.containsKey(name))
                clients.put(name, new TreeMap <String, Integer>());
            TreeMap <String, Integer> clientNew = clients.get(name);

            if (!clientNew .containsKey(productName))
                clientNew .put(productName,0);
            Integer NewCount = clientNew.get(productName);
            clientNew .put(productName, NewCount + count);
        }

        for(Map.Entry<String, TreeMap <String, Integer>> entry : clients.entrySet()) {
            String key = entry.getKey();
            TreeMap <String, Integer> value = entry.getValue();

            System.out.println(key + ":");

            for(Map.Entry<String,Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();

                System.out.println(keyProduct + " " + valueProduct);
            }
        }
    }
}
