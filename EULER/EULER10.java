public class EULER10
{
  public static void main(String[] args)
  {
    long count=2;
    for(int i =3;i<2000001;i+=2)
    {
      if(isPrime(i))
      {
        count+=i;
      }
    }
    System.out.println(count);
  }
  public static boolean isPrime(int n)
  {
    if(n%2==0)
    {
      return false;
    }
    for(int i =3;i<(((int)Math.sqrt(n))+1);i+=2)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
}
