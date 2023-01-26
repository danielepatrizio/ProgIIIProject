
import java.io.*;
public class DataStream {
    public static void main(String [] args)
    {
       File file = new File("filename.txt");
       if(file.exists()){
           System.out.println("File esiste: " + file.getName());
       }
       else
       {
           try
           {

               if(file.createNewFile()){
                   System.out.println("file è stato creato");
                   System.out.println("file path: "+ file.getAbsolutePath());
               }
               else
               {
                   System.out.println(("non si crea"));
               }
           }
           catch(Exception e)
        {
        System.out.println(e.toString());
       }
    }
       try {
       DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
       DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
       out.writeInt(72);
       out.writeDouble(678.00);
       out.writeFloat(123.45F);

       int var1 = in.readInt();
       double var2 = in.readDouble();
       float var3 = in.readFloat();

       System.out.println("interger value: " + var1);
       System.out.println("double value: " + var2);
       System.out.println("float value: " + var3);

       out.close();
       }
       catch (Exception e)
        {
            System.out.println(e.toString());
        }
  }
}
