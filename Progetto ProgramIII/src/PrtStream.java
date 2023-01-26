import java.io.*;

public class PrtStream {
    public static void main(String [] args)
    {
        try
        {
          PrintStream out = new PrintStream("filename3.txt");

          int var1 = 10;

          System.out.println("il valore di var1 è: " + var1);
          out.println("il valore di var1 è: " + var1);
          out.close();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
