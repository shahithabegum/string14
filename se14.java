import java.util.*;
import java.lang.*;
class se14
{
  public static void main(String arg[])
   {
     try
         {
            String s="This Excerise 1";
             int d=s.codePointAt(1);
	System.out.println(d);
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}