import java.util.*;
public class Sumofdidits{
    public static void main(String[] args)
    {
        int n,sum=0;
        System.out.print("Enter number:");
        Scanner obj= new Scanner(System.in);
        n = obj.nextInt();
        for(int i=n;i>0;i=i/10)
        {
           sum=sum+(i%10);
        }
        System.out.print("Sum of digits : "+sum);

    }
}