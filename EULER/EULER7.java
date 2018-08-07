public class EULER7
{
  public static void main(String[] args)
  {
    int count = 3;
    for(int i =3;i<4000000;i+=2)
    {
      if(isPrime(i))
      {
        count++;
      }
      if(count == 10000)
      {
        System.out.println(i);
        break;
      }
    }
  }
  public static boolean isPrime(int input)
  {
    if(input%2==0)
    {
      return false;
    }
    for(int i = 3;i<Math.sqrt(input)+5;i+=2)
    {
      if(input%i==0)
      {
        return false;
      }
    }
    return true;
  }
}
