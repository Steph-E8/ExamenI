
/**
 * Esta clase es el tablero del juego realiado * 
 * @author Stephanny Espinoza
 * @version 8/10/2021
 */
public class TableroDeCompus
{
    private Computadora compu;
    private Computadora[][] matrizDeCompus;
    private TableroDeCompus tablero;
    private Arbitro arbitro;
    private int contador;
    private int contadorDos;
    private int [][] matrizDeEspaciosComputadora;

    public TableroDeCompus(int filas, int columnas)
    {
        this.compu= compu;
        this.tablero=tablero;
        this.arbitro =new Arbitro(tablero);
        this.matrizDeCompus=new Computadora[filas][columnas];
        this.contador=0;
        this.contadorDos=1;
        matrizDeEspaciosComputadora=new int[filas][columnas];
        for(int indice=0; indice<filas ; indice++){
            for(int indiceDos=0; indiceDos<columnas; indiceDos++){
                if(contador <= arbitro.getCantidadComputadoras()){
                    this.matrizDeCompus[2*indice][2*indiceDos]=new Computadora();  
                    contador++;
                }
                else{
                    this.matrizDeCompus[2*indice][2*indiceDos]=null;  
                }
                
            }
        }
    
    }

    
    public boolean asignarIdentificador(int filas, int columnas){
        boolean IdentificadorAsignado=false;        
        for(int indice=0; indice<filas ; indice++){
            for(int indiceDos=0; indiceDos<columnas; indiceDos++){
                if(this.matrizDeCompus[indice][indiceDos]!=null){
                    this.matrizDeEspaciosComputadora[indice][indiceDos]=contadorDos;  
                    contadorDos++;
                    IdentificadorAsignado=true;
                } 
                else{
                    IdentificadorAsignado=false;
                }
            }
        } 
        return IdentificadorAsignado;
    }
    
    public String toString(){
        String resultadoMatriz="";
        int contador=1;
            for(int fila=0; fila<arbitro.getFilas(); fila++ ){
                for(int columna=0; columna<arbitro.getColumnas(); columna++){
                    if(contador%(arbitro.getColumnas())==0){
                        resultadoMatriz+=" | " +String.valueOf(this.matrizDeEspaciosComputadora[fila][columna]) + " | \n";  
                        contador++;
                    }else{
                        resultadoMatriz+=" | " + String.valueOf(this.matrizDeEspaciosComputadora[fila][columna])  + " |  " ;  
                        contador++;
                    }

                }
            }
        return resultadoMatriz;
    }
    
        public void setCompu(Computadora compuP){
        this.compu=compuP;
    }
        
    public Computadora getCompu(){
        return this.compu;
    }
    
        
    public void setMatrizDeCompu(Computadora [][] compuP){
        this.matrizDeCompus=compuP;
    }
        
    public Computadora [][] getMatrizDeCompu(){
        return this.matrizDeCompus;
    }
    
     public static void main(String[] parametros)
    {
     // TableroDeCompus  tablero= new TableroDeCompus(arbitro.getFilas(),arbitro.getColumnas());
    }
    

}
