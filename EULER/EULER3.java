
public class EULER3
{
  public static void main(String[] args)
  {
    long l =Long.parseLong("600851475143");
    long divider=2;
    while(divider<l)
    {
      if(l%divider==0)
      {
        l=l/divider;
      }
      else
      {
        divider++;
      }
    }
    System.out.println(l);
  }
}
