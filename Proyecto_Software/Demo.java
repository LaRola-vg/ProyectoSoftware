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
        usuario_1=new Usuario("MiniRolis", "7");
        
        System.out.println("==============LISTEN THE CARD==============");
        System.out.println("\nBienvenido "+ usuario_1.getNick());
        System.out.println("\nEscoge el tamaño del tablero: \nOprime 1 para jugar en un tablero 2x2 \nOprime 2 para jugar en un tablero 3x3");
        System.out.println("\n\nSuponemos que el ususario oprimio 1\n\n");
        System.out.println("\nEscoge el tema del tablero: \nOprime 1 para jugar en un tablero sobre  animales \nOprime 2 para jugar en un tablero sobre colores");
        System.out.println("\n\nSuponemos que el ususario oprimio 1\n\n");
        System.out.println("==============Generando la lección==============");
        leccion_1=new Leccion("MiniRolis", 4, 5, 1);
        //EL NUMERO 1 ES EL ID DEL TEMA ANIMALES
        

        
        
    }

        public static void main(String[] args)
    {
        new Demo();
    }   
}
