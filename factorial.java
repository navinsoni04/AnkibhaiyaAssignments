import java.util.*;
public class factorial{
    public static void main(String[] args)
    {
        int n,f=1;
        System.out.print("Enter number:");
        Scanner obj= new Scanner(System.in);
        n = obj.nextInt();
        for(int i=n;i>0;i--)
        {
            f=f*i;
        }
        System.out.print("Factorial of "+n +" is :" +f);

    }
}