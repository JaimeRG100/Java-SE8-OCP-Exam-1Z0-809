public class TestClassY
{
  static StringBuffer sb1 = new StringBuffer();
  static StringBuffer sb2 = new StringBuffer();
  public static void main(String[] args)
  {
    new Thread
      (
       new Runnable()
         {
      public void run()
      {
        synchronized(sb1)
        {
          sb1.append("X");
          synchronized(sb2)
          {
            sb2.append("Y");
          }
        }
        System.out.println(sb1);
      }
    }
    ).start();
    new Thread
      (
       new Runnable()
         {
      public void run()
      {
        synchronized(sb2)
        {
          sb2.append("Y");
          synchronized(sb1)
          {
            sb1.append("X");
          }
        }
        System.out.println(sb2);
      }
    }
    ).start();
  }
}
