package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] a = new int[4];


	    /* Collections */
       /*
           List-ы (списки): ArrayList, LinkedList
           Set-ы (множества): TreeSet, HashSet,...
           Map-ы (словари, ассоц.массивы):  Hashmap, Hashset,...

        */

        ArrayList names = new ArrayList();  // 20
        names.add("Ivan");
        names.add("Max");
        names.add("Petr");
        names.add("Alex");
        names.add(1);
        names.add(133);
        names.add(0,"Sidor");
        names.add(0,"Sidor222");
        names.add(2,"Ayrat");

        //int x = (int)names.get(2);

        for(int i=0;i<names.size();i++) {
            System.out.println(names.get(i));
        }

        ArrayList<Integer> y = new ArrayList<>();
        y.add(1);
        y.add(435345);

        int p = (int)y.get(1);

        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while(true) {
            String word = scan.nextLine();
            if(word.isEmpty()) break;
            words.add(word);
        }
        //foreach
        for(String i: words) System.out.print(i + " ");

    }
}
