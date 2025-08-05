import java.util.Scanner;

public class SumOfNaturalNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of natural number");
    int len= sc.nextInt();
    int sum=0;
    for(int i=1;i<=len;i++){
     sum=sum+i;
    }
    System.out.println("Here is the sum of  " + len +  " natural number=> " + sum );
  }
}
