package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import static com.company.Methods.setCounter1;

public class Pro02_06 {




    static Scanner scan;



    public static void main(String[] args) throws IOException {

        Brands brand1 = new Brands();

         boolean runGame = true;

         Methods m1 = new Methods();


        scan = new Scanner(System.in);


        //Reading from a file
/*
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/user/Desktop/new.txt"));

        String line = bufferedReader.readLine(); {}
        while (line != null) {
            brand1.brandslist.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

 */







        //  ArrayList storing brands already provided by a user
        ArrayList<String> usersList = new ArrayList<>();





        System.out.println("Witaj w grze, w ktorej Twoim zadaniem jest podanie jak najwiekszej liczby marek samochodow");
        System.out.println("Za kazda poprawna marke samochodu otrzymasz 5 punktow");
        System.out.println("Jesli nie jestes w stanie wymyslec kolejnej marki, mozesz w kazdej chwili zakonczyc gre wciskajac przycisk X na klawiaturze");
        System.out.println("");

        while (runGame) {
            System.out.println("");
            System.out.println("Runda: " + Methods.setCounter1());
            System.out.println("Podaj marke samochodu");

            m1.readFile("C:\\Users\\user\\Desktop\\new.txt", brand1.brandslist);
            m1.convertingArrayListToUppercase(brand1.brandslist);

       /*

            while (scan.hasNext()) {
                String  brandslist =scan.nextLine();
*/

            Scanner scanner1 = new Scanner(System.in);
            String input = scanner1.nextLine();

            for (int i=0; i < brand1.brandslist.size(); i++ ) {


                if (input.isEmpty()) {
                    System.out.println("Nie podano zadnej marki. Wprowadz nazwe odpowiedniej marki");
                    break;

                    // Checking if the user gussed a brand stored in the brandslist + checking if user's input is not a duplicate
                } else if (brand1.brandslist.get(i).contains(input.toUpperCase(Locale.ROOT)) && !usersList.contains(input.toUpperCase(Locale.ROOT))) {
                    System.out.println("Match!!");
                    System.out.println("Zdobywasz 5 punktow");
                    // Storing user's score
                    m1.score1.add(Methods.getResult());
                    //Adding user's input into the userList
                    usersList.add(input.toUpperCase(Locale.ROOT));
                    break;



                    // Condition if a brand is correct but already given
                } else if (brand1.brandslist.get(i).contains(input.toUpperCase(Locale.ROOT)) && usersList.contains(input.toUpperCase(Locale.ROOT))) {
                    System.out.println("Duplikat! Ta marka zostala juz podana. Podaj inna marke");
                    break;


                    // Provding wrong answer  If condition and both else if are false printing this
                } else if (!brand1.brandslist.get(i).contains(input) && i == brand1.brandslist.size() -1) {
                    System.out.println("Pudło");
                    break;



                    //Ending the game
                } else if (input.equals("X") || input.equals("x")) {
                    System.out.println("Gra zakonczona");
                    // Suming the final resolut and printing
                    System.out.println("Ostateczny wynik w grze to: " + m1.SumFinalResult(m1.score1));
                    // Storing the final resoult in a file
                    m1.writeResultIntoFile("C:\\Users\\user\\Desktop\\Results.txt", m1.SumFinalResult(m1.score1));
                    runGame = false;
                    break;


                    //  Code to sum and print user's score
                    // int sum=0;
                    //  for ( int i : m1.score1){
                    //    sum+=i;
                    //     System.out.println("OStateczny wynik w grze" + sum);

                    // System.out.println("Ostateczny wynik w grze to: " + m1.score1.stream().mapToInt(value -> value).sum());





                } else {

                }









    } } }}





































        //  }












































