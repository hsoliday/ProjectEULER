public class EULER14
{
  public static void main(String[] args)
  {
    int seed=0;
    int length=0;
    for(int i = 2;i<1000001;i++)
    {
      int d =Collatz((long)i);
      if(length<d)
      {
        seed=i;
        length=d;
      }
    }
    System.out.println(seed);
  }
  public static int Collatz(long n)
  {
    int count =0;
    while(n!=1)
    {
      if(n%2==0)
      {
        n/=2;
      }
      else
      {
        n=3*n+1;
      }
      count++;
    }
    return count;
  }
}
