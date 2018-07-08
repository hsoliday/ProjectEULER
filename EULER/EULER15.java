import java.util.HashMap;
public class EULER15
{
  static HashMap<String, Long> map;
  public static void main(String[] args)
  {
      map = new HashMap<String,Long>();
      long test = 40;
    System.out.println(pascal(test,test/2));
    //just trying to calculate the 20th middle of pascals triangle
    /* (40 ) binomial of this vector
    *  (20 )
    */

  }
  public static long pascal(long top,long bottom)
  {
        String key =(new Long(top)).toString()+ " "+(new Long(bottom)).toString();
        if(map.containsKey(key))
        {
          return map.get(key);
        }
        if (bottom == 0 || top == bottom)
        {
            return 1;
        }
        long k =pascal(top - 1, bottom - 1) + pascal(top - 1, bottom);
        map.put(key,k);
        return k;
  }

}
