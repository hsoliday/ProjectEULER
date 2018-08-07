import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Collections;

public class EULER22
{
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<String>();
    try
    {
      BufferedReader br = new BufferedReader(new FileReader("EULER22DATA.txt"));
      String line;
      while ((line = br.readLine()) != null)
      {
        list.add(line);
      }
    }
    catch(Exception e)
    {
      System.out.println("ERROR");
    }
    String[] tmp = list.get(0).split("\",\"");
    for(int i =0;i<tmp.length;i++)
    {
      tmp[i] = tmp[i].replace("\"","");
    }
    ArrayList<String> lis = new ArrayList();
    for(String s: tmp)
    {
      lis.add(s);
    }
    Collections.sort(lis);
    long g = 0;
    for(int i =0;i<tmp.length;i++)
    {
      g+=score(lis.get(i))*(i+1);
    }
    System.out.println(g);
  }
  public static long score(String s)
  {
    int count = 0;
    for(int i =0;i<s.length();i++)
    {
      count += (s.charAt(i)-'A')+1;
    }
    return (long)count;
  }
}
