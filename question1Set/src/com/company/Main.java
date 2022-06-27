package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String firstName;
        String searchName = null;
        String[] fNames =  new String[5]; // storing names in array

        //storing names in a list
        for (int i =0; i < fNames.length; i++)
        {
            System.out.println("Please enter your first Name" );
            fNames[i] =input.nextLine();
        }


        Set <String> set1 = new HashSet<String>();
        for (int i =0; i < fNames.length; i++)
        {
            set1.add(fNames[i]);
        }

        System.out.printf("%s ", set1);

        //Searching and eliminates duplicates by storing them in a Set


            System.out.println("Enter name to search");
            searchName = input.nextLine();


        if (set1.contains(searchName))
        {
            set1.remove(searchName);
            System.out.println("Name has been removed");

        }
        else {
            System.out.println("Name does not exist");
        }


    }
}
