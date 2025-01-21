import java.util.Scanner;

public class gCd {
    public static void main(String[] args)
    {
         int n1,n2,l=0,i;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter 1st number:");
        n1= obj.nextInt();
        System.out.print("Enter 2nd number:");
         n2= obj.nextInt();
            for(i=2;i<n2;i++)
            {
               if(n1%i==0 && n2%i==0){
               l=i;  
               
               }
            }
            System.out.print(l);
    }
}