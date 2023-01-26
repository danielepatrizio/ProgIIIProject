import java.io.*;

public class IntStream {
    public static void main(String[] args){
        try
        {
            FileInputStream inputStream = new FileInputStream("filename.txt");
            int data = inputStream.read();

                    while(data != -1)
                    {
                        System.out.print(data);
                        data = inputStream.read();
                    }

          inputStream.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }


}

