package org.example;
import java.io.FileReader;
import java.util.ArrayList;
import au.com.bytecode.opencsv.CSVReader;


public class Main {
    public static void main(String[] args)throws Exception {
        ArrayList<Person> Spisok = new ArrayList<Person>();
        CSVReader input = new CSVReader(new FileReader("E:\\Загрузки\\foreign_names\\foreign_names.csv"), ';' ,'"' , 1);
        String[] nextLine = input.readNext();
        while ((nextLine) != null) {
            Person newLine = new Person(nextLine);
            Spisok.add(newLine);
            nextLine = input.readNext();
        }

        for (int i = 0;i < Spisok.size();i++)
        {
            System.out.println(Spisok.get(i).toString());
        }
    }
}