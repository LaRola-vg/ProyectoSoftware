import java.util.*;
/**
 * Clase Usuario: Contiene los datos del usuario, así como su saldo en monedas
 * Además de contener el avatar y poder visualizarlo.
 * @author (CardenasJeisson & VargasLaura) 
 * @version (1.0.0)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String nick;
    private String edad;
    private Tienda tienda;
    private Armario armario;

    /**
     * @param nick: Nombre del usuario.
     * @param edad: Edad del usuario.
     * @param tienda: Accede al artículo y ve si está bloqueado o no
     * @param armario: Asigna al avatar el artículo que el usuario dejó
     * seleccionado en el armario.
     */
    public Usuario(String nick, String edad)
    {
        this.nick=nick;
        this.edad=edad;        
    }
    
    public String getNick()
    {
        return nick;
    }
    
    public String getEdad()
    {
        return edad;
    }
    
}
