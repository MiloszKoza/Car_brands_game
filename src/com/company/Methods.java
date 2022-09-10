package com.company;

import com.opencsv.CSVWriter;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Methods {
    static int counter;
    static int counter1 =0;
    public static final String CSV_Pathname = "C:\\\\\\\\Users\\\\\\\\user\\\\\\\\Downloads\\\\\\\\Baza  - Base.csv";


    // Converting final result to String
    public static  String convertIntToSting( int intToConvert) {
        String convertedInt = String.valueOf(intToConvert);
        return convertedInt;
    }




    //  ArrayList storing user's score
    ArrayList<Integer> score1 = new ArrayList<>();

    LocalDate myObj = LocalDate.now();

          // Writing final result into a file
        public void writeResultIntoFile (String fileName,int data) throws IOException {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println( "Data: "+ myObj + "  " + "Wynik: " + data);
            pw.close();
            fw.close();

    }


    public int SumFinalResult (ArrayList <Integer> result) {
        int myInt= result.stream().mapToInt(value -> value).sum();
            return myInt;
    }

    public void readFile ( String fileName, ArrayList data) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            data.add(line);


            ;
        }
    }
        public void convertingArrayListToUppercase (ArrayList<String> nameOfArrayList) {
            for (int i = 0; i < nameOfArrayList.size(); i++) {

                String brandlistUpper = nameOfArrayList.get(i).toUpperCase(Locale.ROOT);
                nameOfArrayList.set(i, brandlistUpper);
                for (String s : nameOfArrayList) ;
 } }

            public static String checkNumberOfRows (String fileName) throws IOException {
            String line;
            int rows =0;

            File myfile = new File(fileName);

            FileReader fr = new FileReader(myfile);

            BufferedReader bufferedReader = new BufferedReader(fr);

            while((line = bufferedReader.readLine()) !=null) {
                String [] myArray = line.split(",");
                rows++;


            }
            String convertedRows = String.valueOf(rows);
            return convertedRows;


                // Writing final result into a CSV file
        } public static void writeToFileCSV (String fileName, int sumedFinalResult) throws IOException {
        LocalDate date = LocalDate.now();
            File myfile1 = new File(fileName);
            FileWriter fileWriter = new FileWriter(myfile1,true);
           CSVWriter csvWriter = new CSVWriter(fileWriter, ',', CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);

           String [] myArray = { checkNumberOfRows(fileName) + "      \t \t \t" + convertIntToSting(sumedFinalResult) + "       \t " + date };

           csvWriter.writeNext(myArray);
           csvWriter.close();
    }

    // reading and printing table of results

    public static void  readResults (String filename) throws IOException {

        File myfile = new File(filename);
        String line;

        FileReader fr = new FileReader(myfile);

        BufferedReader bufferedReader = new BufferedReader(fr);

        while ((line = bufferedReader.readLine()) != null) {
            String[] myArray = line.split(",");
            for (String s : myArray) {
                System.out.printf("%-10s", s);
            }
            System.out.println();

        }
    }














    // method to count points
    public static int getResult() {
        counter =+5;
        return counter;


    }

    // method to count rounds
  public static int setCounter1 () {
        counter1++;
        return counter1;
    }





}
