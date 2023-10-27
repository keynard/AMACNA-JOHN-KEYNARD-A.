import java.util.*;
public class PEMDA{
public static void main(String[] args){
Scanner b = new Scanner(System.in);
System.out.println("Enter first number");
int num1 = b.nextInt();
System.out.println("Enter second number");
int num2 = b.nextInt();
int prod = num1 * num2;
int mult = num1 - num2;
int div = num1 / num2;
int add = num1 + num2;
System.out.println("product = "+ prod);
System.out.println("Minus = "+ mult);
System.out.println("division = "+ div);
System.out.println("Add = "+ add);

}
}