package DateParsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
    private final static int NUMBER_OF_DATES = 2;
    public int outputTheDifferenceBetweenDates (String[] dates){
        int numOfMonth1 = returnDate(dates[0]);
        int numOfMonth2 = returnDate(dates[1]);
        int diff = numOfMonth2 - numOfMonth1 ;
        if (diff > 0){
        return diff;}
        else {
            System.out.println(" Unpropper input . Date is incorrect or difference between dates is 0 ");
        }
    return 0;
    }
    public int returnDate (String maybeDate){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date properDate = new Date();
        try {

            properDate = format.parse(maybeDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (properDate.getYear()<0 || properDate.getYear()>2018){
            System.out.println("Incorrect date");
            return 0;
        }
        if (properDate.getMonth()<0 || properDate.getMonth()>12){
            System.out.println("Incorrect date");
            return 0;
        }
        if (properDate.getDay()<0 || properDate.getDay()>31){
            System.out.println("Incorrect date");
            return 0;
        }
        return properDate.getMonth()+properDate.getYear()*12;
    }
    public static String getDate (){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String maybeDate = "";
        try {

            maybeDate = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maybeDate ;
    }
    public String[] inputDates (){
        String[] dates = new String[2];
        System.out.println(" Input Agreement date in format: yyyy-MM-dd ");
        dates[0] = getDate();
        System.out.println(" Input Calculation date in format: yyyy-MM-dd ");
        dates[1] = getDate();

        return dates;
    }
}
