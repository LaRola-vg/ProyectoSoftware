
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
    private Carta cartas_Seleccionadas[];
    private Carta cartas_tema1[]= new Carta[10];
    private Carta cartas_tema2[]= new Carta[10];
    
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
        generador_tablero(x, y, this.ID_Tema);
        
      }
    public void generador_tablero(int x, int y, int ID_Tema){
        /* 
        * Se crea una matriz de tamaño [x,y] para guardar las cartas 
        */
        
        
        
       
        Carta Tablero[][]= new Carta [x][y];
        //Teniendo en cuenta que solo habrá tableros 2x2 y 2x3 para esta version
        //se mirará cuantas cartas son necesarias
        if(y != 2){
            cantidad_Cartas=3;
        }
        else{
            cantidad_Cartas=2;
        }
        crear_Familia_Cartas();
     }
        public void crear_Familia_Cartas(){
        cartas_Seleccionadas = new Carta[cantidad_Cartas];
        if(ID_Tema==1){
           Carta carta1=new Carta(1,1); 
           Carta carta2=new Carta(1,2);
           Carta carta3=new Carta(1,3);
           Carta carta4=new Carta(1,4);
           Carta carta5=new Carta(1,5);
           Carta carta6=new Carta(1,6);
           Carta carta7=new Carta(1,7);
           Carta carta8=new Carta(1,8);
           Carta carta9=new Carta(1,9);
           Carta carta10=new Carta(1,10);
            
           cartas_tema1[0]=carta1;
           cartas_tema1[1]=carta2;
           cartas_tema1[2]=carta3;
           cartas_tema1[3]=carta4;
           cartas_tema1[4]=carta5;
           cartas_tema1[5]=carta6;
           cartas_tema1[6]=carta7;
           cartas_tema1[7]=carta8;
           cartas_tema1[8]=carta9;
           cartas_tema1[9]=carta10;
           
           int rand_temp=random_number();
           int comparar=90;
           
            for(int i=0;i<cantidad_Cartas;i++){
               if(rand_temp!=comparar){
                 cartas_Seleccionadas[i]= cartas_tema1[rand_temp];                 
               }
               comparar=rand_temp;
               rand_temp=random_number();               
           }
         } 
        else{
            Carta carta1=new Carta(2,1); 
            Carta carta2=new Carta(2,2);
            Carta carta3=new Carta(2,3);
            Carta carta4=new Carta(2,4);
            Carta carta5=new Carta(2,5);
            Carta carta6=new Carta(2,6);
            Carta carta7=new Carta(2,7);
            Carta carta8=new Carta(2,8);
            Carta carta9=new Carta(2,9);
            Carta carta10=new Carta(2,10);
            
            cartas_tema2[0]=carta1;
            cartas_tema2[1]=carta2;
            cartas_tema2[2]=carta3;
            cartas_tema2[3]=carta4;
            cartas_tema2[4]=carta5;
            cartas_tema2[5]=carta6;
            cartas_tema2[6]=carta7;
            cartas_tema2[7]=carta8;
            cartas_tema2[8]=carta9;
            cartas_tema2[9]=carta10;
        }        
    }
    public int  getErrores(){
        return errores;
    }
    public int getAciertos(){
        return aciertos;
    }
    public int random_number(){
      int numero_Carta = (int) Math.floor(Math.random()*10);
      return numero_Carta;
     }
}
