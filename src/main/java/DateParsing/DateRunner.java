package DateParsing;

public class DateRunner {
    public static void main(String[] args) {
        DateParser dateParser = new DateParser();
        String[] dates = dateParser.inputDates();
        dateParser.outputTheDifferenceBetweenDates(dates);
    }
}
