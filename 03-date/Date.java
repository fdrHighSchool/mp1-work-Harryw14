
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Date
{
  public static void main(String[]args){
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the day");
   String d= s.nextLine();
   
   System.out.println("Enter the day of the week");
   String day= s.nextLine();
   
   System.out.println("Enter the month");
   String month= s.nextLine();
   
   System.out.println("Enter the year");
   String year= s.nextLine();
   
   System.out.println(day+","+month+" "+d+" "+year);
   System.out.println(day+" "+d+" "+month+" "+year);
 }
}

