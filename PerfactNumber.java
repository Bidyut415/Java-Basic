import java.util.Scanner;

public class PerfactNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number to check it is perfact or not");
    int num=sc.nextInt();

    int sum=0;

    for(int i=1;i<num;i++){
      if(num%i==0){
        sum=sum+i;
      }
    }
    if(sum==num){
      System.out.println("The number is perfact=> " + num);
    }else{
      System.out.println("the number is not perfact=> " + num);
    }
  }
}
