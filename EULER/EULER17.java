public class EULER17
{
  public static void main(String[] args)
  {
    int count = 0;
    for(int i =0;i<=1000;i++)
    {
      count+=toString(i).length();
    }
    System.out.println(count);
  }
  public static String toString(int i)
  {
    String[] tens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    if(i<20)
    {
      return ones[i];
    }
    if(i<100)
    {
      int tmp1 = i/10;
      int tmp2 = i%10;
      return tens[tmp1]+toString(tmp2);
    }
    if(i<1000)
    {
      int tmp1 = i/100;
      int tmp2 = i%100;
      if(tmp2!=0)
      {
        return ones[tmp1]+"hundredand"+toString(tmp2);
      }
      else
      {
        return ones[tmp1]+"hundred";
      }
    }
    if(i==1000)
    {
      return "onethousand";
    }
    return "";
  }
}
