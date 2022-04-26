package com.company;
import java.util.Scanner;
class Library{
    Scanner sc = new Scanner(System.in);
    String []Abooks = new String[17];
    String []Ibooks = new String[17];

    String Title1 = "Percy Jackson : ";
    String Title2 = "Hero's of Olympus : ";
    String Title3 = "Harry Potter and ";
    String Bissue = "This book has been issued!";

    int Booknum = 0;
    int issue;
    int Return;
    String navig;

    public Library() {
        System.out.println("Welcome to Fandom Library\n");
        Abooks[0] = Title1 + "The Lightning Thief";
        Abooks[1] = Title1 + "The Sea of Monsters";
        Abooks[2] = Title1 + "The Titans Curse";
        Abooks[3] = Title1 + "The Battle of the Labyrinth";
        Abooks[4] = Title1 + "The Last Olympian";
        Abooks[5] = Title2 + "The Lost Hero";
        Abooks[6] = Title2 + "The Son of Neptune";
        Abooks[7] = Title2 + "The Mark of Athena";
        Abooks[8] = Title2 + "The House of Hades";
        Abooks[9] = Title2 + "The Blood of Olympus";
        Abooks[10] = Title3 + "the Sorcerer's Stone";
        Abooks[11] = Title3 + "the Chamber of Secrets";
        Abooks[12] = Title3 + "the Prisoner of Azkaban";
        Abooks[13] = Title3 + "the Goblet of Fire";
        Abooks[14] = Title3 + "the Order of the Phoenix";
        Abooks[15] = Title3 + "the Half-Blood Prince";
        Abooks[16] = Title3 + "the Deathly Hallows";

        for (String element : Abooks) {
            System.out.println(element + " - " + Booknum++);
        }
        System.out.print("\n");
    }

    public void Libmenu(){
        System.out.println("\nLibrary Menu");
        System.out.println("Enter i to Issue another Book");
        System.out.println("Enter r to return a Book");
        System.out.println("Enter a to see available Books");
        System.out.println("Enter e to exit");
        navig = sc.next();

        if(navig.equals("i")){
            issueBook();
        }
        if(navig.equals("r")){
            returnBook();
        }
        if(navig.equals("a")){
            availableBooks();
        }
        if(navig.equals("e")){
            exit();
        }
        else{
            System.out.println("Please enter a valid option");
        }
    }

    public void issueBook(){
        System.out.println("Please enter the book number of the book you would like to issue?");
        issue = sc.nextInt();
        Ibooks[issue] = Abooks[issue];
        System.out.println(Abooks[issue]+ " has been issued");
        Abooks[issue] = Bissue;
        Libmenu();
    }

    public void returnBook(){
        System.out.println("Please Enter the book number of the book you would like to return");
        Return = sc.nextInt();
        if(Ibooks[Return] != null) {
            Abooks[Return] = null;
            Abooks[Return] = Ibooks[Return];
            Ibooks[Return] = null;
            System.out.println(Abooks[Return] + " has been returned");
        }
        else{
            System.out.println("Sorry, this book has not been issued");
        }
        Libmenu();
    }

    public void availableBooks(){
        Booknum = 0;
        for (String element : Abooks) {
            System.out.println(element + " - " + Booknum++);
        }
        Libmenu();
    }

    public void exit(){
        System.out.println("Confirm Exit? y/n");
        navig = sc.next();
        if(navig.equals("y")){
            System.out.println("Have a nice day!");
            System.exit(0);
        }
        else{
            for (String element:Ibooks) {
                System.out.println(element);
            }
            Libmenu();
        }

    }
}

public class Ex4_FandomLibrary {
    public static void main(String[] args) {
        // Problem Statement : Implement a Library using JAVA
        // Methods : issueBook, returnBook, availableBooks , addBooks
        // Array to store available Books, issued Books
        Library Ab = new Library();
        Ab.issueBook();
    }
}
