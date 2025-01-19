public class fibbo{
    public static void main(String[] args) {
        int a=0,b=1,c=0;
         System.out.print(a+"\t");
         System.out.print(b+"\t");
        while(c<10)
        {
            
            c=a+b;
            if(c>10)
            {
                System.exit(0);  
            }
            System.out.print(c+"\t");
            a=b;
            b=c;
            
        }

     
    }
  }