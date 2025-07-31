import java.util.Scanner;

public class ReverseNum {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a number to show reverse ");
    int num=Sc.nextInt();
    int reverse=0;
    while(num>0){
      int rem=num%10;
      reverse = reverse * 10 + rem;
      num=num/10;
    }
    System.out.println("After reverse the number look like= " + reverse );
  }
}
