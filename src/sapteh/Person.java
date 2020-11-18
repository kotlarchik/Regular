package sapteh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String lastName;
    private String firstName;
    private String patronomyc;
    private Date dataBirtDay;
    private String days;

    public Person(String firstName, String lastName, String patronomyc, Date dataBirtDay, String days){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronomyc = patronomyc;
        this.dataBirtDay = dataBirtDay;
        this.days = days;
    }

    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getPatronomyc(){
        return patronomyc;
    }
    public Date getDataBirtDay(){
        return dataBirtDay;
    }
    public String getDays(){
        return  days;
    }

    public int count(){
        Date datTo = new Date();
        return (int)((datTo.getTime() - getDataBirtDay().getTime())/1000/60/60/24/365);
    }
    // Счётчик дней до дня рождения.
//    public int days(){
//        Date dateTo1 = new Date();
//        return (int)((dateTo1.getTime() - getDataBirtDay().getTime()) / 1000/60/60/24);
//    }

    private String dateToString(){
        return new SimpleDateFormat("dd.MM.yyyy").format(getDataBirtDay());
    }
    public String toString(){
        return String.format("Name: %s LastName: %s Patronomyc: %s\nDate Happy Birthday: %s\nYears: %d, %s",
                getLastName(), getFirstName(), getPatronomyc(), dateToString(), count(), getDays());
    }
}