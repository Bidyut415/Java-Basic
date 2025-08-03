import java.util.Scanner;

public class LCM {
  public static int findGCD(int a, int b){
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter num1");
    int num1= sc.nextInt();
    System.out.println("Enter num2");
    int num2=sc.nextInt();

    int gcd=findGCD(num1,num2);

    int lcm=(num1*num2)/gcd;
    System.out.println("LCM of " + num1 + " and " + num2 + " is:" +  lcm);
  }
}
