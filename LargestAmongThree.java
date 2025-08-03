import java.util.Scanner;

public class LargestAmongThree {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter three number to check large");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();

    int large=0;
    if(num1>num2 && num1>num3){
      large=num1;
    }if(num2>num1 && num2>num3){
      large=num2;
    }else{
      large=num3;
    }
    System.out.println("among these three largest is=> " + large);
  }
}
