import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Serializable;
/**
 * Clase Carta: Encargada de la información que irá en las cartas
 * contando así con el sonido repectivo a la imagen de la carta,
 * dicha información dependerá del tema del que se trate
 * 
 * @author (CardenasJeisson & VargasLaura) 
 * @version (1.0.0)
 */
public class Carta
{
    public int tema_carta;
    public int numero_carta;
    private String label_carta;
    public String cartas_elegibles[]= new String[10];
    
    public String[] crear_labels_animales(){
        String label_carta[]= new String[10];
        label_carta[0]="conejo";
        label_carta[1]="perro";
        label_carta[2]="gato";
        label_carta[3]="pato";
        label_carta[4]="aveja";
        label_carta[5]="tigre";
        label_carta[6]="jirafa";
        label_carta[7]="leon";
        label_carta[8]="sapo";
        label_carta[9]="gallina";
        return label_carta;
    }
    
    public String[] crear_labels_colores(){
        String label_carta[]= new String[10];
        label_carta[0]="amarillo";
        label_carta[1]="azul";
        label_carta[2]="rojo";
        label_carta[3]="verde";
        label_carta[4]="morado";
        label_carta[5]="naranja";
        label_carta[6]="marron";
        label_carta[7]="negro";
        label_carta[8]="blanco";
        label_carta[9]="lila";
        return label_carta;
    }
    /*
    Esta parte será provisional para esta versión, en la cual no existe una
    base de datos, simplemente se almacenarán los datos en Arrays.       
    */
    
    /**
     * @param tema_carta: Identificador del tema de la carta
     * @param numero_carta: Identificador de la carta que será tomado en la BD.
     */
    public Carta(int tema_carta,int numero_carta)
    {
      //1 es el id del tema animales, y 2 el id de tema colores
      this.tema_carta=tema_carta;
      this.numero_carta=numero_carta;
      if(tema_carta==1){
          cartas_elegibles=crear_labels_animales();
      }else if(tema_carta==2){
          cartas_elegibles=crear_labels_colores();
      }
      
      this.label_carta=cartas_elegibles[numero_carta];
    }
    
    public void importarDatos(){
      /*
      * Método para importar las imágenes y audios de una base de datos.
      */
    }
    public String get_label(){
        return label_carta;
    }
    
    public String get_label_carta()
    {
        return label_carta;
    }
}
