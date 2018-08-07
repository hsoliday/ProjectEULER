import java.math.BigInteger;
public class EULER20
{
  public static void main(String[] args)
  {
    BigInteger base = BigInteger.ONE;
    for(long i =1;i<101;i++)
    {
      base = base.multiply(BigInteger.valueOf(i));
    }
    String number = base.toString();
    char[] nums = number.toCharArray();
    long count = 0;
    for(int i = 0;i<nums.length;i++)
    {
      count+=(nums[i]-'0');
    }
    System.out.println(count);
  }
}
