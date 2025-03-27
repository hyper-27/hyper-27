import java.util.Scanner;
//(238)10 = (1423)5
public class decibaltoany{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int snum = scan.nextInt();
    int sb = scan.nextInt();
    
    int res = bias(snum,sb);
    System.out.println(res);
    }
    public static int bias(int snum,int sb ){
    int ans=0;
  int multi = 1 ;
  while (snum != 0){
  int rem = snum % sb;
  ans = ans + (rem* multi);
  multi = multi * 10;
  snum = snum / sb ;

}
return ans ;
    }
    
    
}