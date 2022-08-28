package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Methods {
    static int counter;
    static int counter1 =0;


    //  ArrayList storing user's score
    ArrayList<Integer> score1 = new ArrayList<>();

          // Writing final result into a file
        public void writeResultIntoFile (String fileName,int data) throws IOException {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(data);
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
