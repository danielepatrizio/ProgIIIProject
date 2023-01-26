import java.io.*;

public class OutStream {
    public static void main(String [] args){
        try
        {
            FileOutputStream fileOutput = new FileOutputStream("filename.txt");
            char H = 'H';
            fileOutput.write((char)H);
            String string = "WE";
            fileOutput.write(string.getBytes());
            fileOutput.close();
    }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
}
}