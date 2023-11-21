import java.util.Scanner;
class Task5{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter Input-1 :  ");
int input1 = scan.nextInt();
System.out.println("Enter Input-2 :  ");
int input2 = scan.nextInt();
System.out.println("-------------------------------");
input1= input1+input2;
input2 = input1-input2;
input1=input1-input2;
System.out.println(input1);
System.out.println(input2);
	}
}
