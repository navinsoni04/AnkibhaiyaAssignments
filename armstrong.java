import java.util.*;
public class  armstrong {
public static void main(String[] args)  
{
int res=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
int n=sc.nextInt();
for(int i=153;i>0;i=i/10)
{
res=res+(i%10)*(i%10)*(i%10);

}
if(res==n)
{
    System.out.println("number is armstrong");
}
else{
    System.out.println("number is armstrong");
}
}  
}
