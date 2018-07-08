public class EULER6
{
  public static void main(String[] args)
  {
    long sum=0;
    long square=0;
    for(int i =1;i<101;i++)
    {
      sum+=i;
    }
    for(int i =1;i<101;i++)
    {
      square+=i*i;
    }
    sum*=sum;
    System.out.println(sum -square);
  }
}
