import java.util.Scanner;
public class LengthOfString {
public static void main(String args[]){
System.out.println("Enter Alpha Numeric with special character its able to identify length");
Scanner scan=new Scanner (System.in);
StringBuilder sb=new StringBuilder();
sb.append(scan.nextLine());
System.out.println(sb.length());       
   } 
}