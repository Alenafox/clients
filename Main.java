package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

public static void main(String[] args) {
TreeMap<String, Integer> products = new TreeMap<>();
TreeMap<String, TreeMap<String, Integer» clients = new TreeMap<>();
Scanner in = new Scanner(System.in);

while (in.hasNext()) {
String str = in.nextLine();
if (str.equals("exit")) {
break;
}
String[] words = str.split(" ");

String name = words[0];
String productName = words[1];
Integer count = Integer.parseInt(words[2]);

if (!clients.containsKey(name))
clients.put(name, products);
TreeMap<String, Integer> client = clients.get(name); //покупатель
if (!client.containsKey(productName))
client.put(productName, 0);
Integer nowCount = client.get(productName);
client.put(productName, nowCount + count);
}
