
public class Electricity
{
public static void main(String [] args)
{
    int unit = 124;
    int bill = 0;
    
    if (unit>100)
    {
    if (unit>=200)
    {
     if (unit >300)
     {
        bill = unit*8;
    }
    else
    
    bill= unit*6;
}
    else 
    
    bill = unit*5;
}
   System.out.println("the AD electricity lmtd.");
   System.out.println("unts consumed" +unit);
   System.out.println("total bill" +bill);
   

}
}