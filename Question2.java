import java.util.*;
public class Question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter you name");
    String name = sc.nextLine();
    System.out.println("Enter your age");
    int age = sc.nextInt();

    System.out.println("Hello " + name + " you are " + age + " years age" );
  }
}
