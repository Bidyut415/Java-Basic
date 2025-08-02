import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check it digits");
    int num = sc.nextInt();
    int count=0;
    if(num==0){
      count=1;
      System.out.println("the number of Digits=> " + count);
    }
    while (num>0) {
      num=num/10;
      count++;
    }
    System.out.println("the number of Disits=> " + count);
  }
}
