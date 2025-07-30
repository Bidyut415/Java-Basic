import java.util.Scanner;
public class Swap {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of num1");
  int num1=sc.nextInt();
  System.out.println("Enter the value of num2");
  int num2=sc.nextInt();
  System.out.println("here is the value of num1=" + num1 +" "+ "num2=" + num2);
  int temp=num1;
  num1=num2;
  num2=temp;
  System.out.println("After swap value of num1= " + num1 +" "+ "num2=" + num2);
  }
  
}
