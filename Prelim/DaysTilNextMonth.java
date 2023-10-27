import java.time.*;
public class DaysTilNextMonth{
public static void main(String[] args){
LocalDate day = LocalDate.now();
int month = day.getDayOfMonth();
int daysinmonth = day.lengthOfMonth();
int year = day.getYear();
//int currMonth = day.();
String A = "October";
System.out.print(A+" "+month+","+year);
//System.out.print(month + ",");
//System.out.println(year);
}
}