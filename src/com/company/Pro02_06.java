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














        /*
        HashMap<String,String> newHashMap = new HashMap<String,String>();

        System.out.println("Podaj markę z dostępnych");
        newHashMap.put("Mazda","RX7");
        newHashMap.put("Daewoo","Tico");
        newHashMap.put("FIAT", "Panda");
        System.out.println(newHashMap);







        Scanner scanner1 = new Scanner(System.in);


        String input = scanner1.nextLine();


        for
        if (newHashMap.keySet().equals(input)){
            System.out.println(newHashMap.get());


            }
        }











         }









        //  }



























             /*



         }

        List<Radios> listOFRadios  =  Arrays.asList (
                new Radios("MXP600",Technology.TETRA),
                new Radios("R7",Technology.MOTOTRBO),
                new Radios("R7A",Technology.MOTOTRBO),
                new Radios("ION",Technology.MOTOTRBO),
                new Radios("CLP446e",Technology.BUISNESS)

        );

        System.out.println("Podaj nazwę technologii z dostępnych:");


        Technology[] values_of_technologies = Technology.values();

        for (Technology technology : values_of_technologies) {
            System.out.println(technology.name());


        }



        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();

        Technology technology = Technology.valueOf(input);


        for ( Radios radios : listOFRadios) {
            if (radios.getTechnonolgy() == technology) {
                System.out.println(radios.getModel()+ " " + radios.getTechnonolgy());



        /*
    }

        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", Category.ROMANTIC),
                new Movie("MAtrix", Category.SCI_FI),
                new Movie("Jurassic Park",Category.SCI_FI),
                new Movie("Piła",Category.HORROR)

        );

        String name = Category.HORROR.name();

        for ( Movie movie : movies) {
            System.out.println(movie.getTitle() + " " + movie.getMovieCategory());





        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kategorię filmu. Dostępne to: ");
        Category[] values = Category.values();

        String category = scanner.nextLine();
        System.out.println("Filmy z tej kategorii");


        for (Movie movie : movies) {
            if(movie.getMovieCategory().name.equals(category))
            System.out.println(movie.getTitle();


         */




















        

        /*

        List<Movie> movies = Arrays.asList(
                new Movie("Titanic", Category.ROMANTIC),
                new Movie("Matrix", Category.SCI_FI),
                new Movie("Jurrasic Park",Category.SCI_FI),
                new Movie("Piła", Category.HORROR) );



        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kategorię filmu. Dostępne to: ");

        Category[] values = Category.values();


        for (Category category : values) {
            System.out.println(category.name());
        }

        String cat= scanner.nextLine();

        Category category = Category.valueOf(cat);


        System.out.println("Filmy  z tej kategorii");


         for (Movie movie: movies) {
             if (movie.getMovieCategory() == category) {
                 System.out.println(movie.getTitle() + " " + movie.getMovieCategory());
*/









