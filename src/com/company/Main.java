package com.company;

import javax.naming.Name;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String[] name = new String [3];
    	name[0] ="Ma";
    	name[1] ="Sa";
    	name[2] ="Pa";
	    System.out.println("Доброе утро, "+name[0]+"!");
		System.out.println("Добрый день, "+name[1]+"!");
		System.out.println("Добрый вечер, "+name[2]+"!");


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
		}


		}


