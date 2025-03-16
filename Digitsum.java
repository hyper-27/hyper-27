
public class Digitsum
{
public static void main(String [] args)
{
int num= 25505,rem= 0,sum = 0 ,temp;
temp=num;
    //the main logic is here
while(num > 0)
{
    rem= num% 10;
    sum = sum + rem;
    num = num/10;
    
}
System.out.println("sum of Digits of" +temp +"is" +sum);
}
}
