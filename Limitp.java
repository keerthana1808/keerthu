import java.util.Scanner;
class Limitp
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int s1=sc.nextInt();
     int s2=sc.nextInt();
     int flag=0;
     for(int i=s1;i<=s2;i++)
     {
         for(int j=2;j<i;j++)
         {
             if(i%j==0)
             {
                 flag=0;
                 break;
             }
             else{
                 flag=1;
             }
         }
         if(flag==1)
     {
         System.out.println(i);
     }
     }
    }            
            
}           
            
            
            
            



