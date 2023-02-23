package net.javaguides.jsonsimple;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        // input of file name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter json file name: ");
        String filename = sc.nextLine();

        //object creation - empty json file is created
        MyMongo collection = new MyMongo(filename);

        //insert function - insertion of document into collection
        System.out.println("insertion: "+collection.insert(1,"ravathu","jahnavi", "rj@email.com"));
        System.out.println("insertion: "+collection.insert(2,"ravathu","jahnavi", "rj@email.com"));

        // read function - display all documents
        System.out.println(collection.find());
        
        // delete documents from collection
        System.out.println(collection.remove());
        
        // delete collection
        System.out.println(collection.drop());
    }
}
