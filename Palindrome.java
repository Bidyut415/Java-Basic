import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check palindrome or not ");
    int num = sc.nextInt();
    int temp = num;
    int rev=0;
    while (num>0) {
      int rem=num%10;
      rev=rev*10+rem;
      num=num/10;
    }
    if(num==rev){
      System.out.println("The number " + temp  + " is Palindrome=> "  + rev);
    }else{
      System.out.println("the number " + temp + " is not palindrome=> " + rev);
    }
  }
}
