import java.util.HashMap;
public class EULER2
{
  static HashMap<Integer,Integer> map;
  public static void main(String[] args)
  {
    map = new HashMap<Integer,Integer>();
    int evenCount=0;
    int num=1;
    while(fib(num)<4000000)
    {
      if(fib(num)%2==0)
      {
        evenCount+=fib(num);
      }
      num++;
    }
    System.out.println(evenCount);
  }
  public static int fib(int n)
  {
    if (n<2)
    {
    return 1;
    }
    if(map.containsKey(n))
    {
      return map.get(n).intValue();
    }
    else
    {
      map.put(n,fib(n-1)+fib(n-2));
      return map.get(n).intValue();
    }

  }
}
