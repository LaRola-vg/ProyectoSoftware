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
 * Clase Demo: Muestra la prueba de funcionamiento inicial de nuestro prototipo
 * 
 * @author (Alejandro Cardenas & Sofía Vargas) 
 * @version (a version number or a date)
 */
public class Demo
{
    // instance variables - replace the example below with your own
    private Usuario usuario_1;
    private Leccion leccion_1;

    /**
     * Constructor for objects of class Demo
     */
    public Demo()
    {
        // initialise instance variables
        usuario_1=new Usuario("MiniRolis", 7);
        
        System.out.println("==============LISTEN THE CARD==============");
        System.out.println("\nBienvenid@ "+ usuario_1.toString());
        System.out.println("\nEscoge el tamaño del tablero: \nOprime 1 para jugar en un tablero 2x2 \nOprime 2 para jugar en un tablero 3x3");
        //leccion_1=new Leccion("MiniRolis");
    }

        public static void main(String[] args)
    {
        new Demo();
    }   
}
