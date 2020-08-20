

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
      this.tema_carta=tema_carta;
      this.numero_carta=numero_carta;
    }
    
    public void importarDatos(){
      /*
      * Método para importar las imágenes y audios de una base de datos.
      */
    }
}
