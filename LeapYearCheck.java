import java.util.Scanner;

public class LeapYearCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an year to check leap year or not");
    int year = sc.nextInt();

    if(( year % 4 == 0   &&   year % 100 !=0 )||( year % 400 == 0 )){
      System.out.println("This year is leap year:=> " + year);
    }else{
      System.out.println("This year is not Leap year=> " + year);
    }
  }
}
