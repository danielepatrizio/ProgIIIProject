import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main{


    //creazione porte per il router//
    public static ArrayList<RoutingTableEntry> main(String[] args) {
        int[] numport = new int[10];

        int routerWidth = 3;
        int routerHeight = 2;
        int[] routerPorts = new int[5];
        int[] routerDstPorts = new int[5];

        return null;
    }
    //lettura file
public void GetFileInfo(){



        //Path della posizione su disco del file di testo che vogliamo leggere in input
        String pathFileName= "./folder/inputFile.txt";

        File inputFile = new File(pathFileName);

        //Creo un oggetto Scanner con fonte di dati il file inputFile.txt
        //che si trova all'interno della cartella folder, all'interno del mio progetto Java
        Scanner scannerDaFile = null;
        try {
            scannerDaFile = new Scanner(inputFile);

            System.out.println("------------------ STAMPA DEL FILE DI TESTO: "+inputFile.getName()+" ----------------------");

            while(scannerDaFile.hasNextLine()) {
                System.out.println(scannerDaFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(scannerDaFile!=null) {
                scannerDaFile.close();
            }
        }

     }
    }



