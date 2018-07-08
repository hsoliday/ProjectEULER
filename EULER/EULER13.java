//Hunter Soliday; Project Euler problem 13
//CRN:20918; CWID:A11684972
import java.math.BigInteger;
import java.util.Scanner;
/**
*this class uses BigInteger to
*sum up 50 large numbers in
* data.txt
*to run this java EULER13 < data.txt
*/
public class EULER13
{
  public static void main(String[] args)
  {
    BigInteger b = new BigInteger("0");
    Scanner scan = new Scanner(System.in);
    String tmp;
    while(scan.hasNext())
    {
      tmp =scan.next();
      b =b.add(new BigInteger(tmp));
    }
    System.out.println(b.toString().substring(0,10));
  }
}
