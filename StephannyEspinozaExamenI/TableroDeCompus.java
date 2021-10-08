
/**
 * Esta clase es el tablero del juego realiado * 
 * @author Stephanny Espinoza
 * @version 8/10/2021
 */
public class TableroDeCompus
{
    private Computadora compu;
    private Computadora[][] matrizDeCompus;

    public TableroDeCompus(int filas, int columnas)
    {
        this.compu= compu;
        this.matrizDeCompus=new Computadora[filas][columnas];
        
        for(int indice=0; indice<matrizDeCompus.length; indice++){
            for(int indiceDos=0; indiceDos<matrizDeCompus.length; indiceDos++){
                this.matrizDeCompus[indice][indiceDos]=new Computadora(filas, columnas);
                
            }
        }
    }
    
        public String toString(){
        String resultadoMatriz="";
        int contador=1;
            for(int fila=0; fila<4; fila++ ){
                for(int columna=0; columna<4; columna++){
                    if(contador%4==0){
                        resultadoMatriz+=" | " + this.matrizDeCompus[fila][columna]  + " | \n";  
                        contador++;
                    }else{
                        resultadoMatriz+=" | " +  this.matrizDeCompus[fila][columna]  + " |  " ;  
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

}
