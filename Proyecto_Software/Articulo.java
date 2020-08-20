
    /**
 * Clase Articulo: Posee un nombre, una imagen y un valor de compra.
 * @author (CardenasJeisson & VargasLaura) 
 * @version (1.0.0)
 */
public class Articulo
{
    private int precio;
    private String nombre;
    private int imagen_articulo;
    private boolean estado_articulo;

     /**
     * @param estado_articulo: Será un booleano que cambiará el estado del
     * artículo de disponible a comprado.
     * @param precio: Precio del artículo.
     * @param nombre: Nombre del artículo.
     * @param imagen_articulo: Identificador de la imagen que será tomada de la BD.
     */
    public Articulo(String nombre, int precio, int imagen_articulo)
    {
        this.nombre=nombre;
        this.precio=precio;
        this.imagen_articulo=imagen_articulo;
    }
    public void importarDatos(){
      /*
      * Método para importar las imágenes y datos de una base de datos.
      */
    }
    public boolean  getEstado_articulo(){
        return estado_articulo;
    }
    public int  getPrecio(){
        return precio;
    }
    public String  getNombre(){
        return nombre;
    }
    }
