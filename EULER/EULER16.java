import java.math.BigInteger;
public class EULER16
{
  public static void main(String[] args)
  {
    BigInteger f = new BigInteger("2");
    f=f.pow(1000);
    System.out.println(countDistance(f.toString()));
  }
  public static int countDistance(String s)
  {
    int tmp=0;
    for(int i =0;i<s.length();i++)
    {
      tmp+=(((int)s.charAt(i))-48);
    }
    return tmp;
  }
}
