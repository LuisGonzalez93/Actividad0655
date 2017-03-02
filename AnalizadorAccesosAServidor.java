import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Write a description of class AnalizadorAccesosAServidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnalizadorAccesosAServidor
{
    private ArrayList<String> log;
    public String AnalizarArchivoDeLog(){
        ArrayList log = new ArrayList();
        String analisis = "";
        try {
            File archivo = new File("access.log");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                log.add(sc.nextLine());
            }
            analisis = sc.toString();
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return analisis;
    }

    public void òbtenerHoraMasAccesos(){
        
            for(int i = 0; i <log.size(); i++){
                log.get(i).substring(11,13);
            }
        
        

    }
}

