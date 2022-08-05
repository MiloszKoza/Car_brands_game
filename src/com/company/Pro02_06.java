package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Pro02_06 {
    static int counter;
    static int counter1 =0;


   // method to count points
    public static int getResult() {
        counter =+5;
        return counter;


    }

    // method to count rounds
    static int setCounter1 () {
        counter1++;
        return counter1;
    }





    static Scanner scan;



    public static void main(String[] args) {

        Brands brand1 = new Brands();

         boolean runGame = true;


        scan = new Scanner(System.in);



         //  ArrayList storing user's score
        ArrayList<Integer> score1 = new ArrayList<>();




        //  ArrayList storing brands already provided by a user
        ArrayList<String> usersList = new ArrayList<>();





        System.out.println("Witaj w grze, w ktorej Twoim zadaniem jest podanie jak najwiekszej liczby marek samochodow");
        System.out.println("Za kazda poprawna marke samochodu otrzymasz 5 punktow");
        System.out.println("Jesli nie jestes w stanie wymyslec kolejnej marki, mozesz w kazdej chwili zakonczyc gre wciskajac przycisk X na klawiaturze");
        System.out.println("");

        while (runGame) {
            System.out.println("");
          System.out.println("Runda: " + setCounter1());
          System.out.println("Podaj marke samochodu");


            Scanner scanner1 = new Scanner(System.in);
            String input = scanner1.nextLine();

            // Checking if the user gussed a brand stored in the brandslist + checking if user's input is not a duplicate
            if (brand1.brandslist.contains(input) && !usersList.contains(input)) {
                System.out.println("Match!!");
                System.out.println("Zdobywasz 5 punktow");
                // Storing user's score
                score1.add(getResult());
                //Adding user's input into the userList
                usersList.add(input);


            // Condition if a brand is correct but already given
            } else if (brand1.brandslist.contains(input) && usersList.contains(input)) {
                System.out.println("Duplikat! Ta marka zostala juz podana. Podaj inna marke");

           //Ending the game
            } else if
                (input.equals("X") || input.equals("x")) {
                System.out.println("Gra zakonczona");

                //  Code to sum and print user's score
            System.out.println("Ostateczny wynik w grze to: " + score1.stream().mapToInt(value -> value).sum());
                runGame = false;

           // If condition and both else if are false printing this
            } else {
                System.out.println("Pudło. Sprobuj ponownie");
            }






    } } }





































        //  }












































