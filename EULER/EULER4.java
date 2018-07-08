public class EULER4
{
  public static void main(String[] args)
  {
    int max=0;
      for(int i =1;i<1000;i++)
      {
        for(int j =1;j<1000;j++)
        {
          if(isPalindrome(i*j))
          {
            if(i*j>max)
            {
              max=i*j;
            }
          }
        }
      }
      System.out.println(max);
  }
  public static boolean isPalindrome(int n)
  {
    String s = (new Integer(n)).toString();
    for(int i =0;i<(s.length()/2);i++)
    {
      if(s.charAt(i)!=s.charAt((s.length()-1)-i))
      {
        return false;
      }
    }
    return true;
  }
}
