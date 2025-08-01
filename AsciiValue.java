import java.util.Scanner;

public class AsciiValue {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a charcter to check ASCII value");
    char ch = sc.next().charAt(0);
    int ascii = (int)ch;
    System.out.println("Ascii value of " + ch + " is => " + ascii);
  }
}
