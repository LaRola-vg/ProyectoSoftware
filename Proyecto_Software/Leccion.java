
/**
 * Clase Lección: Encargada de la generación de lecciones aleatorias, teniendo en
 * cuenta que tendrá conexión con la clase DuoCarta, para así, poder cargar las cartas
 * en el tablero.
 * 
 * @author (CardenasJeisson & VargasLaura) 
 * @version (1.0.0)
 */
public class Leccion
{
    private int[] tamano_tablero;
    private int errores=0;
    private int aciertos=0;
    private Carta carta;
    
    /**
     * @param tamano_tablero: Vector el cual contendrá dos números que     
     * serán el tamaño del tablero
     * @param errores: Número que contará la cantidad de errores que comete
     * el usuario en una lección
     * @param aciertos: Número que contará la cantidad de aciertos que comete
     * el usuario en una lección
     * @param carta: Cartas que se solicitaran a la clase carta.
     */
    public Leccion(String nick, int x, int y)
    {
        /*this.errores = errores;
        this.aciertos = aciertos;
        this.carta = carta;
        tamano_tablero = new int[2];
        Parametros de entrada: nick y tamaño del tablero
        */
       
      }
    public void generador_tablero(int x, int y){
        /* 
        * Se crea una matriz de tamaño [x,y] para guardar las cartas 
        */
       int Tablero[][]= new int [x][y];
       
      }
    public int  getErrores(){
        return errores;
    }
    public int getAciertos(){
        return aciertos;
    }
}
