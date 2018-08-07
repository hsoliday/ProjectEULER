import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
public class EULER67
{
  public static HashMap<Node,Integer> map= new HashMap();
  public static HashMap<String,Node> nodeMap = new HashMap();
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<String>();
    try
    {
      BufferedReader br = new BufferedReader(new FileReader("EULER67DATA.txt"));
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
    EULER67 n = new EULER67();//you never saw this (this is aweful form, for those who do not get why this comment exists)
    Node head = n.add(0,0,list);
    System.out.println(max(head));
  }
  public static int max(Node head)
  {

    if(head == null)
    {
      return 0;
    }
    if(map.containsKey(head))
    {
      return map.get(head).intValue();
    }
    int left = max(head.left);
    int right = max(head.right);
    if(left>right)
    {
      map.put(head,head.value +left);
      return head.value +left;
    }
    else
    {
      map.put(head,head.value +right);
      return head.value +right;
    }
  }
  public Node add(int depth,int width,ArrayList<String> num)
  {
    String j = (new Integer(depth).toString())+" "+(new Integer(width).toString());
    if(depth == num.size())
    {
      return null;
    }
    if(nodeMap.containsKey(j))
    {
      return nodeMap.get(j);
    }
    Node tmp = new Node();
    tmp.value = tmp.toInt(num.get(depth).split(" ")[width]);
    tmp.left = add(depth+1,width,num);
    tmp.right = add(depth+1,width+1,num);
    nodeMap.put(j,tmp);
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
