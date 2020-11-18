package sapteh;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException, ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.YEAR, 0);

        List<Person> personList = new ArrayList<>();
        String writeFile = "Regular.txt";

        // Create new File
        String createFile = "Regular.txt";
        File file = new File(createFile);
        System.out.println(file.createNewFile());

        // sout
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите информацию:");
        String write = buffer.readLine();
        FileWriter fileWriter = new FileWriter(writeFile);
        Person person = getPerson(write);
        personList.add(person);
        for(Person person1 : personList) {
            fileWriter.write(person.toString());
        }
        fileWriter.close();
    }
    public static Person getPerson(String line) throws ParseException {
        String[] array = line.split(" ");
        String firstName = array[0];
        String lastName = array[1];
        String patronomyc = array[2];
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(array[3]);
        String days = String.format("%ta", date);

        return new Person(firstName, lastName, patronomyc, date, days);
    }
}