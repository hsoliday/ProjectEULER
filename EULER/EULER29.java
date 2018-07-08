import java.math.BigInteger;
import java.util.LinkedList;
public class EULER29
{
  public static void main(String[] args)
  {
    LinkedList<String> arr = new LinkedList<String>();
     BigInteger b;
      for(int i = 2;i<101;i++)
      {
        for(int j = 2;j<101;j++)
        {
          b = BigInteger.valueOf(i).pow(j);
          arr.add(b.toString());
        }
      }
      LinkedList<String> tmp = new LinkedList<String>();
      for(String s:arr)
      {
        if(!tmp.contains(s))
        {
          tmp.add(s);
        }
      }
      System.out.println(tmp.size());
  }
}
