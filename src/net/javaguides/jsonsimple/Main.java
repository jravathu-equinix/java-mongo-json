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
        MyMongo m = new MyMongo(filename);

        //insert function
        System.out.println("insertion: "+m.insert(1,"ravathu","jahnavi", "rj@email.com"));
        System.out.println("insertion: "+m.insert(2,"ravathu","jahnavi", "rj@email.com"));

        // read function - display all
        System.out.println(m.find());
        
        // delete data - documents from collection
        System.out.println(m.remove());
    }
}
