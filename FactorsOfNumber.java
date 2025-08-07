import java.util.Scanner;

public class FactorsOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number to check it's factor");
    int num = sc.nextInt();
    for(int i=1;i<=num;i++){
      if(num%i==0){
        System.out.println(i);
      }
    }
  }
}
