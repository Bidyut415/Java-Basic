import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number to chek it's Armstrong or mot");
    int num=sc.nextInt();
    int originalNum=num;
    int sum=0;
    while(num>0){
      int rem = num%10;
      sum=sum+(rem*rem*rem);
      num=num/10;
    }
    if(originalNum==sum){
      System.out.println("this is a Armstrong number=> " + originalNum);
    }else{
      System.out.println("this is not a Armstrong number=> " + originalNum);
    }
  }
}
