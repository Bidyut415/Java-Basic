import java.util.Scanner;

public class PrimeCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check it is prime or not ");
    int num = sc.nextInt();
    int prime = 0;
    for(int i=1;i<num;i++){
      if(num%2==0){
         prime=0;
      }else{
        prime=1;
      }
    }
    if(prime==1){
      System.out.println("Prime:= "+ num);
    }else{
      System.out.println("Not Prime:= "+ num);
    }
  }
}
