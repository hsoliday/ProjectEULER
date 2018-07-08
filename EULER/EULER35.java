import java.util.ArrayList;
public class EULER35
{
  public static void main(String[] args)
  {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    arr.add(2);
    for(int i =3;i<1000001;i+=2)
    {
      if(isPrime(i))
      {
        arr.add(i);
      }
    }
    int tmp =0;
    int[] n = new int[arr.size()];
    for(Integer i : arr)
    {
      n[tmp++]=i.intValue();
    }
    int finalcount = 0;
    for(int i: n)
    {
      if(isCircular(i,n))
      {
        finalcount++;
      }
    }
    System.out.println(finalcount);
  }
  public static boolean isPrime(int n)
  {
    if(n%2==0)
    {
      return false;
    }
    for(int i =3;i<((int)Math.sqrt(n))+1;i+=2)//slight optimization
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  public static boolean isCircular(int n,int[] j)
  {
    if( (new Integer(n)).toString().length() == 1)
    {
      return true;
    }
      for(int i =0;i<length(n);i++)
      {
        if(!contains(rotate(n,i),j))
        {
          return false;
        }
      }
      return true;
  }
  public static boolean contains(int n, int[] j)
  {
    for(int i:j)
    {
      if(i==n)
      {
        return true;
      }
    }
    return false;
  }
  public static int rotate(int n,int i)
  {
    String s =(new Integer(n)).toString();
    String rotato = "";
    i=i%s.length();
    for(int k=0;k<s.length();k++)
    {
      rotato+=s.charAt((k+i)%s.length());
    }
    return Integer.parseInt(rotato);
  }
  public static int length(int n)
  {
    return (new Integer(n)).toString().length();
  }
}
