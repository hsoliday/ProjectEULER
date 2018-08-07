public class EULER5
{
  public static void main(String[] args)
  {
    long max = 1l;
    for(long i = 1;i<=20;i++)
    {
      max*=i;
    }
    for(long i = 20;i<max;i+=20)
    {
      if(isDiv(i))
      {
        System.out.println(i);
        break;
      }
    }
  }
  public static boolean isDiv(long count)
  {
    for(long i = 1;i<=20;i++)
    {
      if(count%i !=0)
      {
        return false;
      }
    }
    return true;
  }
}
