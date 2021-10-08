
/**
 * Establece las reglas del juego
 * 
 * @author Stephanny Espinoza
 * @version 8/10/2021
 */
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Arbitro
{
    private TableroDeCompus tablero;
    private JOptionPane interfaz;
    private String menu;
    private Controlador controlador;
    private int filas;
    private int columnas;
    private int cantidadComputadoras;
    
    public Arbitro(TableroDeCompus tableroP)
    {
        this.interfaz=interfaz;
        this.tablero=tableroP;
        this.filas=0;
        this.columnas=0;
        this.cantidadComputadoras=0;
        menu = "Escoja una opción:\n1. Mostrar tablero de Computadoras \n2.Terminar partida";
    }
    
    
    //este es el metodo que nos permite jugar, es decir aqui encontamos las opciones para ejecutarlo internamente
    //es como un segundo menu
    public void jugar()
    {
        String opcion="";
        do {
            do{
            opcion = interfaz.showInputDialog(null, menu);         
            }while(opcion==null || opcion.equals(""));
           
            switch (opcion){
                case "1":
                    String opcionIngresarPalabra="";
                    cantidadComputadoras=Integer.parseInt(this.interfaz.showInputDialog(null,"Ingrese la cantidad de computadoras")); 
                    filas=Integer.parseInt(this.interfaz.showInputDialog(null,"Ingrese la cantidad de filas")); 
                    columnas=Integer.parseInt(this.interfaz.showInputDialog(null,"Ingrese la cantidad de columnas")); 
                     interfaz.showMessageDialog(null,this.tablero.toString() + "Se lograron poner las computadoras"); 
                    if(tablero.asignarIdentificador(filas, columnas)==true){
                         interfaz.showMessageDialog(null,this.tablero.toString() + "Se lograron poner las computadoras"); 
                    }

                    break;
                case "2":
                    
                    break;
                case "3":
                    break;
            }
        }while(!opcion.equals("2") || opcion.equals(" ") || opcion.equals(null));
    }
    
        //asigan mediante parametro un string al atributo de clase
    public void setMenu(String menuP){
        this.menu=menuP;
    }
    
    //Devuelve lo que contiene el string llamado menu
    public String getMenu(){
        return this.menu;
    }
    
    // asigna mediante parametro al objeto controlador   
    public void setControlador(Controlador controladorP){
        this.controlador=controladorP;
    }
    
    //devuelve un objeto de tipo controlador
    public Controlador getControlador(){
        return this.controlador;
    }
    
    // Este metodo inicializa un objeto de tipo interfaz por parametro
    public void setInterfazR(Interfaz interfazP){
        this.interfaz=interfazP;
    }
    
    // Este metodo devuelve un objeto de tipo interfaz
    public JOptionPane getInterfazR(){
        return this.interfaz;
    }
    
        public void setTableroDeCompus(TableroDeCompus tableroP){
        this.tablero= tableroP;
    }
    
    // Este metodo devuelve un objeto de tipo interfaz
    public TableroDeCompus getTableroDeCompus(){
        return this.tablero;
    }
    
    public int getFilas(){
        return this.filas;
    }
    
    public int getColumnas(){
        return this.columnas;
    }
    
    public int getCantidadComputadoras(){
        return this.cantidadComputadoras;
    }
    

    

}

 
