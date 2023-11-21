import java.util.Scanner;
class Task3{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter Input-1 :  ");
int input1 = scan.nextInt();
System.out.println("Enter Input-2 :  ");
int input2 = scan.nextInt();
System.out.println("Enter Input-3 :  ");
int input3 = scan.nextInt();
System.out.println("Enter Input-4 :  ");
int input4 = scan.nextInt();
System.out.println("Enter Input-5 :  ");
int input5 = scan.nextInt();

System.out.println("-------------------------------");
System.out.println("The average of 5 inputs is : "+ (input1 + input2 + input3 + input4 + input5) / 5);
	}
}
