

/**
 * En esta clase encontramos lo que el usuario observa cuando se esta jugando
 * es decir, las ventanas, los metodos aqui se implementan en las otras clases afines.
 * @author Stephanny Espinoza 
 * @version 19/09/2021
 */
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Interfaz extends JOptionPane
{
    private final String TITULO;
    private final ImageIcon IMAGEN;
    
    /**
     * Le asocia al objeto un título y una imagen que serán utilizados en las ventanas de interacción.
     * Supone que el archivo con la imagen se encuentra en la misma carpeta del código fuente.
     */
    public Interfaz(String elTitulo, String nombreArchivoImagen)
    {
        TITULO = elTitulo;
        IMAGEN = new ImageIcon(this.getClass().getResource(nombreArchivoImagen));
    }
    
    //este metodo asigna el mesaje que queremos que se imprima en la ventada de dialogo
    public void decirMensaje(String elMensaje)
    {
        this.showMessageDialog(null, elMensaje, TITULO, PLAIN_MESSAGE, IMAGEN);
    }
    
    //este metodo ingresamos el mensaje que queremos que se imprima pero devuelve lo que el usuario ingrese
    public String pedirHilera(String elMensaje)
    {
        String resultado;
        resultado = this.showInputDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
        return resultado;
    }
    
    //contiene los botones necesarios para darle opciones al usuario
    public int pedirOpcion(String[] lasOpciones, String elMensaje)
    {
        int resultado;
        resultado = this.showOptionDialog(null, elMensaje, TITULO, DEFAULT_OPTION, PLAIN_MESSAGE, IMAGEN, lasOpciones, null);
        return resultado;
    }
    
   
}
