import java.util.HashMap;
public class EULER12
{
  public static void main(String[] args)
  {
    long j = 0;
    long base =2;
    do
    {
      base++;
      j = findDivisors(findNthTriangularNumber(base));
    }
    while(j<500);
    System.out.println(findNthTriangularNumber(base));
  }
  public static long findDivisors(long n)
  {
    long count =0;
    for(long i = 1;i<Math.sqrt(n);i++)
    {
      if((((double)n)/((double)i)==(n/i)))
      {
        count+=2;
      }
    }
    return count;
  }
  public static long findNthTriangularNumber(long n)
  {
    return ((n*(n-1))/2);
  }
}
