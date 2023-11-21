import java.util.Scanner;
class Task7{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a value:");
char alpha = scan.next().charAt(0);
int alpha1 = (int) alpha;
System.out.println("-------------------------------");
System.out.println("The ASCII value of " +alpha + " is " + alpha1 );
	}
}