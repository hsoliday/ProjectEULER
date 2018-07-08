public class EULER40
{
  public static void main(String[] args)
  {
    StringBuilder s = new StringBuilder("");
    Integer n = 1;
    while(s.length()<1000000)
    {
      s.append(n.toString());
      n++;
    }
    String g = s.toString();

    System.out.println((s.charAt(0)-'0')*(s.charAt(9)-'0')*(s.charAt(99)-'0')*(s.charAt(999)-'0')*(s.charAt(9999)-'0')*(s.charAt(99999)-'0')*(s.charAt(999999)-'0'));
  }
}
