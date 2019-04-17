package com.company;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String[] name = new String [3];
    	name[0] ="Ma";
    	name[1] ="Sa";
    	name[2] ="Pa";
    	Collection collection = new ArrayList();
    	collection.add("Ka");
		Iterator iterator  = collection.iterator();


		for (int i = 0; i < 3; i++){
			switch (name[i]){
				case "Ma":
					System.out.println("Доброе утро, "+name[i]+"!");
					break;
				case "Sa":
					System.out.println("Добрый день, "+name[i]+"!");
					break;
				case "Pa":
					System.out.println("Добрый вечер, "+name[i]+"!");
					break;
			}
		}
			    Object collection1 = collection; {
		System.out.println("Здравствуй, "+iterator.next()+"!");}
		}


		}


