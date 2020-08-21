import java.util.*;
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
    //private int[] tamano_tablero;
    private int ID_Tema;
    private int errores=0;
    private int aciertos=0;
    private int cantidad_Cartas;
    private int x;
    private int y;
    private Carta cartas_Seleccionadas[];
    private Carta cartas_Duplas[];
    private Carta cartas_leccion[];
    private Carta Tablero[][];

    /**
     * @param tamano_tablero: Vector el cual contendrá dos números que     
     * serán el tamaño del tablero
     * @param errores: Número que contará la cantidad de errores que comete
     * el usuario en una lección
     * @param aciertos: Número que contará la cantidad de aciertos que comete
     * el usuario en una lección
     * @param carta: Cartas que se solicitaran a la clase carta.
     */
    public Leccion(String nick, int x, int y, int ID_Tema)
    {
        /*this.errores = errores;
        this.aciertos = aciertos;
        this.carta = carta;
        tamano_tablero = new int[2];
        Parametros de entrada: nick y tamaño del tablero
        */
        this.x=x;
        this.y=y;
        this.ID_Tema=ID_Tema;
        this.Tablero=generador_tablero(this.x, this.y, this.ID_Tema);
        for(int i=0; i<x; i++){
            System.out.print("\n");
            for(int j=0; j<y;j++){
                System.out.print("\t"+Tablero[i][j].get_label()+"\t");
            }
        }
    }
   public Carta[][] generador_tablero(int x, int y, int ID_Tema){
        //Se crea una matriz de tamaño [x,y] para guardar las cartas
        this.x=x;
        this.y=y;
        this.ID_Tema=ID_Tema;
        Carta Tablero[][]= new Carta [x][y];
        int cantidad_Cartas=(x*y)/2;
        ArrayList<Carta[]> lista = new ArrayList<Carta[]>();
        lista=crear_Familia_Cartas(cantidad_Cartas, ID_Tema);
        cartas_Seleccionadas=lista.get(0);
        cartas_Duplas=lista.get(1);
        
        cartas_leccion= new Carta[x*y];
        int rand_temp[]=new int[x*y];
        for(int i=0; i<(x*y); i++){
            int cond=1;
            while(cond>0){
                rand_temp[i]=random_number(x*y);
                cond=0;
                for(int j=0; j<i; j++){
                    if(rand_temp[i]==rand_temp[j]){
                        cond++;
                    }
                }
            }
            if(rand_temp[i]>((x*y)/2)-1){
                cartas_leccion[i]=cartas_Duplas[(rand_temp[i]-(cantidad_Cartas))];
                
            }else{
                cartas_leccion[i]=cartas_Seleccionadas[rand_temp[i]];
            }
        }
        int cont=0;
        for(int i=0; i<x; i++){
            for(int j=0; j<y;j++){
                Tablero[i][j]=cartas_leccion[cont];
                cont++;
            }
        }
        return Tablero;
    }

    public ArrayList<Carta[]> crear_Familia_Cartas(int cantidad_Cartas, int ID_Tema){
        this.cantidad_Cartas=cantidad_Cartas;
        this.ID_Tema=ID_Tema;
        //Creamos manualmente las cartas ya que en este momento no contamos con la base de datos que corresponde a 
        //los datos de las cartas del juego
        int rand_temp[]=new int[cantidad_Cartas];
        rand_temp[0]=random_number(10);
        cartas_Seleccionadas= new Carta[cantidad_Cartas];
        cartas_Duplas= new Carta[cantidad_Cartas];
        cartas_Seleccionadas[0]= new Carta(ID_Tema, rand_temp[0]);
        cartas_Duplas[0]= cartas_Seleccionadas[0];
        for(int i=1; i<cantidad_Cartas;i++){
            int cond=1;
            while(cond>0){
                rand_temp[i]=random_number(10);
                cond=0;
                for(int j=0; j<i; j++){
                    if(rand_temp[i]==rand_temp[j]){
                        cond++;
                    }
                }
            }
            cartas_Seleccionadas[i]= new Carta(ID_Tema, rand_temp[i]);
            cartas_Duplas[i]= cartas_Seleccionadas[i];
        }
        ArrayList<Carta[]> list = new ArrayList<Carta[]>();
        list.add(cartas_Seleccionadas);
        list.add(cartas_Duplas);
        return list;
    }
    
    public void mostrar_tablero(int x, int y){

    }

    public int  getErrores(){
        return errores;
    }

    public int getAciertos(){
        return aciertos;
    }

    public int random_number(int x){
        int numero_Carta = (int) Math.floor(Math.random()*x);
        return numero_Carta;
    }
}
