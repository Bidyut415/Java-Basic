import java.util.Scanner;

public class PowerOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base number");
    int num = sc.nextInt();

    System.out.println("Enter the exponent number");
    int expo=sc.nextInt();

    int result=1;
    for(int i=1;i<=expo;i++){
     result=result*num;
    }
    System.out.println("The power of  " + num + " is => " + result);
  }
}
