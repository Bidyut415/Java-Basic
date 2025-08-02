import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a number to show it's sum of Digits");
    int num = Sc.nextInt();
    int sum=0;
    while(num>0){
      int rem = num%10;
      sum=sum+rem;
      num=num/10;
    }
    System.out.println("Here is your Sum of Digits=> " + sum);
  }
}
