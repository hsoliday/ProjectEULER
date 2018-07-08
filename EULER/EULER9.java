public class EULER9
{
  public static void main(String[] args)
  {
    for(int i =1;i<1001;i++)
    {
      for(int j =i+1;j<1001;j++)
      {
        int a = i;
        int b = j;
        int c = sqrt((a*a)+(b*b));
        if((a+b+c)==1000)
        {
          System.out.println(a*b*c);
          System.out.print(a);
          System.out.print(" ");
          System.out.print(b);
          System.out.print(" ");
          System.out.println(c);
        }
      }
    }
  }
  public static int sqrt(int i)
  {
    double d = Math.sqrt(i);
    if(d == (int) d)
    {
      return (int) d;
    }
    else
    {
      return 10000;
    }
  }
}
