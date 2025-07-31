import java.util.Scanner;

public class Fact {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number to check it Factorial");
    int num = sc.nextInt();
    int result=1;
    for(int i=num;i>1;i--){
       result=result*i;
    }
    System.out.println("Here is your factorial value");
    System.out.println(result);
  }
}
