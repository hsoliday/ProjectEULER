import java.math.BigInteger;
public class EULER97
{
  public static void main(String[] args)
  {
    BigInteger i = new BigInteger("28433");
    BigInteger b = new BigInteger("2");
    BigInteger c = new BigInteger("10000000000000");
    i= i.multiply(b.modPow(BigInteger.valueOf(7830457), c));//this function is oddly handy
    i= i.add(BigInteger.ONE);
    String k = i.toString();
    System.out.println(k.substring(k.length()-10));

  }
}
