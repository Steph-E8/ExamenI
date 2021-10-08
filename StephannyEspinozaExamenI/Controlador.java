
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
    private final String[] OPCIONES = {"1.Salir","2.Manual","3.Distribuir Computadoras en laboratorio", "4.Ver creditos"}; 
    private Interfaz interfaz;
    private Arbitro arbitro;
    private TableroDeCompus tablero;
    private int filas;
    private int columnas;
    
    //En el constructor inicializamos los atributos de las clases
    public Controlador()
    {
         this.interfaz = new Interfaz(TITULO_VENTANAS, NOMBRE_ARCHIVO_IMAGEN);
         this.tablero=tablero;
         this.arbitro=arbitro;
         this.filas=0;
         this.columnas=0;
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
                    int CantidadComputadoras=0;

                     CantidadComputadoras=Integer.parseInt(this.interfaz.showInputDialog(null,"Ingrese la cantidad de computadoras")); 
                      filas=Integer.parseInt(this.interfaz.showInputDialog(null,"Ingrese la cantidad de filas")); 
                       columnas=Integer.parseInt(this.interfaz.showInputDialog(null,"Ingrese la cantidad de columnas")); 
                         arbitro.jugar();
                    
                    break;
                case 3:
                    int codigo = 10084;
                    char simbolo = (char)codigo;
                    interfaz.showMessageDialog(null, "Este juego fue elaborado por \n Stephanny Espinoza, B42411" +simbolo);
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
    
        
    // Este metodo devuelve un objeto de tipo arbitro
    public int getFilas(){
        return this.filas;
    }
    public int getColumnas(){
        return this.columnas;
    }
 
     public static void main(String[] parametros)
    {
        Controlador controlador = new Controlador();
        controlador.iniciar();
    }
}
