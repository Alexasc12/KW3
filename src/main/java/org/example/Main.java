package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {
            ArrayList<String> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            String[] array = a.split(" ");
            String b = array[0];
            String c = array[1];
            switch (b) {


                case ("ADD"): {
                    String[] arrayCopy = Arrays.copyOfRange(array, 1, array.length);
                    String delimiter = " ";
                    String result = String.join(delimiter, arrayCopy);
                    list.add(result);
                    System.out.print("добавленно дело  ");
                    for (String str : arrayCopy) {
                        System.out.print(" " + str);
                    }
                }
                System.out.println(list.toString());
                break;

                case ("LIST"): {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + "-" + list.get(i));
                    }
                    break;

                }
                case ("EDIT"): {
                    int i = Integer.parseInt(c.trim());
                    System.out.println(i);
                    String[] arrayCopy = Arrays.copyOfRange(array, 2, array.length);
                    String delimiter2 = " ";
                    String result2 = String.join(delimiter2, arrayCopy);
                    list.set(i,result2);

                }
                System.out.println(list.toString());

            }

        }

    }

}



