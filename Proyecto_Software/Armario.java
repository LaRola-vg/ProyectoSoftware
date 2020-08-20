
/**
 * Clase Armario: Permite visualizar los artículos que el usuario ha comprado
 * Asigna el artículo que el usuario tendrá puesto en su avatar.
 * @author (CardenasJeisson & VargasLaura) 
 * @version (1.0.0)
 */
public class Armario
{
    private Tienda tienda;
    private boolean seleccionado;
    /**
     * @param tienda: Para acceder a los artículos de la tienda.
     * @param seleccionado: Identificador para el accesorio seleccionado
     * que podrá visualizar el usuario.
     */
    public boolean  getSeleccionado(){
        return seleccionado;
    }
}
