public class EULER21
{
  public static void main(String[] args)
  {
    int[] test= new int[10000];
    int sum = 0;
    for(int i = 0;i<test.length;i++)
    {
      test[i]=dfunc(i);
    }
    for(int i = 0;i<test.length;i++)
    {
      try
      {
        if(test[test[i]] == i&&test[i]!=test[test[i]])
        {

          sum+=test[i];
          sum+=test[test[i]];
          test[i]=0;
          test[test[i]]=0;
        }
      }
      catch(Exception e)
      {
        ;
      }
    }
    System.out.println(sum);
  }
  public static int dfunc(int i)
  {
    int base = 0;
    for(int n = 1;n<i;n++)
    {
      if(i%n==0)
      {
        base+=n;
      }
    }
    return base;
  }
}
