
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
    private Computadora compu;
    private Computadora[][] matrizDeCompus;
    private JOptionPane interfaz;
    private String menu;
    private Controlador controlador;
    
    public Arbitro(int filas, int columnas)
    {
        this.interfaz=interfaz;
        this.controlador=controlador;
        this.compu= compu;
        this.matrizDeCompus=new Computadora[filas][columnas];
        menu = "Escoja una opción:\n1. Mostrar tablero \n2. Revolver tablero \n3. Terminar partida";
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
           
            int numeroIngresado=0;
            switch (opcion){
                case "1":
                    int codigo = 10084;
                    char simbolo = (char)codigo;
                    int codigo1 = 9786;
                    char simbolo1 = (char)codigo1;
                    int codigo2 = 10035;
                    char simbolo2 = (char)codigo2;
                    String opcionIngresarPalabra="";
                    Object object=new Object();
                    do{
                        //interfaz.showMessageDialog(null,this.tablero.toString()+ "\n" +simbolo2 + " Palabras acertadas: \n\n " +  this.tablero.imprimirMatrizPalabras() +" \n "+ simbolo + " " + "SU PUNTAJE TOTAL ES: " + tablero.getContadorPuntaje()+ " " + simbolo1);
                        do{
                            object=(this.interfaz.showInputDialog(null,"Ingrese las coordenadas de cada letra de la palabra deseada!! "+ simbolo1+ "\n  Ejemplo: 01213141 "+ " \n (digite 00000000 si desea finalizar)")); 
                        }while(object==null);
                        opcionIngresarPalabra=(String)(object); 
                       // tablero.revisarVecindario(opcionIngresarPalabra);
                    }while( !opcionIngresarPalabra.equals("00000000") ||opcionIngresarPalabra.equals(" ") ||  opcionIngresarPalabra.equals(null)); 
                    break;
                case "2":
                    // this.tablero.agitarMatrizTablero();
                    break;
                case "3":
                    break;
            }
        }while(!opcion.equals("3") || opcion.equals(" ") || opcion.equals(null));
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
    
    public void setCompu(Computadora compuP){
        this.compu=compuP;
    }
        
    public Computadora getCompu(){
        return this.compu;
    }
    

}

 
