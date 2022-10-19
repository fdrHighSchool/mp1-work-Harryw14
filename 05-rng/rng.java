
/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class rng
{
  public static void main(String[]args){
    Scanner s= new Scanner(System.in);
    Random r=new Random();
    System.out.println("What gamemode do you want\neasy\nmedium\nhard");
    String mode= s.nextLine();
    if (mode.equals("easy")){
     int min=0;
     int max=10;
  } else if(mode.equals("medium")){
     int min=0;
     int max=50;
    }
     else if(mode.equals("hard")){
     int min=0;
     int max=100;
}
    System.out.println("Enter your guess");
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
    int pg=s.nextInt();//pg=player guess
    if(pg!=mn){
     if(pg<mn){
      System.out.println("you were off by"+(mn-pg));
    }
     if(pg>mn){
      System.out.println("you were off by"+(pg-mn)); 
     }
    else{
       System.out.println("Correct");
    } 
  }
}