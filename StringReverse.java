public class StringReverse {
public static void main(String args[]){
String reverse=" ";
String Original="I'm a Java Developer ";
char character[]=Original.toCharArray();
for(int i=character.length-1;i>=0;i--){
reverse+=character[i];
}
System.out.println(reverse);
    }
}