import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter num1 ");
    int num1 = Sc.nextInt();
    System.out.println("Enter num2");
    int num2 = Sc.nextInt();
    int a=num1;
    int b=num2;
    
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
      
    }
    System.out.println("GCD of " + num1 + " and " + num2 + " is => " + a);
  }
}
