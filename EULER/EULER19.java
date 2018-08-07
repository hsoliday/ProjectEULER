import java.time.LocalDate;
public class EULER19
{
  public static void main(String[] args)
  {
    int count = 0;
    LocalDate d = LocalDate.of(1901, 1, 1);
    LocalDate d2 = LocalDate.of(2001, 1, 1);
    while(d.isBefore(d2))
    {
      if(d.getDayOfWeek().toString()=="SUNDAY"&&d.getDayOfMonth()==1)
      {
        count++;
      }
      d = d.plusDays(1);
    }
    System.out.println(count);
  }
}
