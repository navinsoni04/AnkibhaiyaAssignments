import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args)
    {
         int n,s=0;
        System.out.print("Enter number:");
        Scanner obj= new Scanner(System.in);
        n= obj.nextInt();
        for(int i=n;i>0;i=i/10)
        {
           s=s*10+(i%10);
        }
        if(s==n)
        {
            System.out.print("Pallindrome");
        }
        else{
            System.out.print("NotPallindrome"); 
        }
      
    }
}
