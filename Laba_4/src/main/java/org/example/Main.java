package org.example;
import java.io.FileReader;
import java.util.ArrayList;
import au.com.bytecode.opencsv.CSVReader;


public class Main {
    public static void main(String[] args)throws Exception {
        ArrayList<Person> Spisok = new ArrayList<Person>();
        CSVReader excel = new CSVReader(new FileReader("E:\\Загрузки\\foreign_names\\foreign_names.csv"), ';' ,'"' , 1);
        if(excel==null) {
            throw new RuntimeException("file read error");
        }
        String[] nextLine = excel.readNext();
        while ((nextLine) != null) {
            Person newLine = new Person(nextLine);
            Spisok.add(newLine);
            nextLine = excel.readNext();
        }

        for (int i = 0;i < Spisok.size();i++)
        {
            System.out.println(Spisok.get(i).toString());
        }
    }
}
