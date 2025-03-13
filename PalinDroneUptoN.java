
public class PalinDroneUptoN
{
  public static void main(String [] args)
  {
    int a,b,rev =0;
    int limit = 50;
    System.out.println("pali... no. are");
    
     for(int i= 1;i<= limit ;i++)
     {
         int n=i;
         while (n>0)
         {
            b= n%10;
            rev= rev*10 +b;
            n=n/10;
    }
       if(rev==i)
    {
    System.out.println(i + "");
    }
    rev =0;
}
    }
}