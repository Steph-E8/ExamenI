
/**
 * Esta clase es la encargada de controlar el juego mediante la interaccion con arbitro e interfaz
 * 
 * @author Stephanny Espinoza
 * @version 20/09/2021
 */
public class Controlador
{
    private final String TITULO_VENTANAS = "Bienvenida(o) :D";
    private final String NOMBRE_ARCHIVO_IMAGEN = "Ima(2).png";
    private final String MENSAJE = "Proceda a elegir una opción";
    private final String[] OPCIONES = {"1.Salir","2.Manual para Jugar","3.Jugar", "4.Ver creditos"}; 
    private Interfaz interfaz;
    private Arbitro arbitro;
    
    //En el constructor inicializamos los atributos de las clases
    public Controlador()
    {
         this.interfaz = new Interfaz(TITULO_VENTANAS, NOMBRE_ARCHIVO_IMAGEN);   
         this.arbitro=arbitro;
    }

    //Este metodo es el encargado de iniciar el juego, el cual despliega varias opciones
    public void iniciar()
    {   
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(OPCIONES, MENSAJE);
            switch (opcion) {
                case 1: 
                    interfaz.showMessageDialog(null, toString());   
                    break;
                case 2: 
                    arbitro.jugar(); 
                    break;
                case 3:
                    int codigo = 10084;
                    char simbolo = (char)codigo;
                    interfaz.showMessageDialog(null, "Este juego fue elaborado por \n Stephanny Espinoza" +simbolo);
                    break;
                case 4:
                    interfaz.showMessageDialog(null, "E");

                    break;
            }
        }while(opcion > 0);
    }
    
    //Este metodo muestra la dinamica del juego, ayuda al jugador
    public String toString(){
        String resultado = "";
        resultado = "La manera correcta para jugar es la siguiente: \n ";
        resultado += "Digite  las coordenadas de cada letra" ;
        resultado += " Ejemplo 01, donde 0 indica que es la fila y 1 la comuna. \n" ;
        resultado += "Para nuestro caso debe digitar cuatro coordenadas pegadas: ejemplo: 02122232. \n  ";
        resultado += "Luego se desplegara un menu con tres opciones, \n una mostrar tablero, dos revolver y tres devolverse al menu princial"; 
        resultado += "\n en caso de querer regresar al menu principal debe introducir: 00000000";
        return resultado;
        
    }
    
    // Este metodo inicializa un objeto de tipo interfaz por parametro
    public void setInterfaz(Interfaz interfazP){
        this.interfaz=interfazP;
    }
    
    // Este metodo devuelve un objeto de tipo interfaz
    public Interfaz getInterfaz(){
        return this.interfaz;
    }
    
        // Este metodo inicializa un objeto de tipo arbitro por parametro
    public void setArbitro(Arbitro arbitroP){
        this.arbitro=arbitroP;
    }
    
    // Este metodo devuelve un objeto de tipo arbitro
    public Arbitro getArbitro(){
        return this.arbitro;
    }
 
     public static void main(String[] parametros)
    {
        Controlador controlador = new Controlador();
        controlador.iniciar();
    }
}
