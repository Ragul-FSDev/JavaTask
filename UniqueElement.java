public class UniqueElement {
public static void main(String args[]){
String str="hariharan";
char ch[]=str.toCharArray();
for(int i=0;i<str.length();i++){
for(int j=i+1;j<str.length();j++)
{
if (ch[i]==ch[j])
{
System.out.println(ch[i]);
}
}
}
}
}