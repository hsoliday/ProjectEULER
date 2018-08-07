import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class EULER18
{
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<String>();
    try
    {
      BufferedReader br = new BufferedReader(new FileReader("EULER18DATA.txt"));
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
    EULER18 n = new EULER18();//you never saw this (this is aweful form, for those who do not get why this comment exists)
    Node head = n.add(0,0,list);
    System.out.println(max(head));
  }
  public static int max(Node head)
  {
    if(head == null)
    {
      return 0;
    }
    int left = max(head.left);
    int right = max(head.right);
    if(left>right)
    {
      return head.value +left;
    }
    else
    {
      return head.value +right;
    }
  }
  public Node add(int depth,int width,ArrayList<String> num)
  {
    if(depth == num.size())
    {
      return null;
    }
    Node tmp = new Node();
    tmp.value = tmp.toInt(num.get(depth).split(" ")[width]);
    tmp.left = add(depth+1,width,num);
    tmp.right = add(depth+1,width+1,num);
    return tmp;
  }
  class Node
  {
    public int value;
    public Node left,right;
    public int toInt(String s)
    {
      int tmp = 0;
      tmp+=((s.charAt(0)-'0')*10);
      tmp+=((s.charAt(1)-'0')*1);
      return tmp;
    }
  }
}
