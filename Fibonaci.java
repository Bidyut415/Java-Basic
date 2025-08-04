import java.util.Scanner;

public class Fibonaci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE LENGTH OF THE SERISE");
    int len=sc.nextInt();

    int first=0,second=1;
    System.out.println("Fibonaci serise of length " + len + " is:");

    for (int i=0;i<len;i++){
      System.out.print(first + " ");
      int next=first+second;
      first=second;
      second=next;
    }
  }
}
