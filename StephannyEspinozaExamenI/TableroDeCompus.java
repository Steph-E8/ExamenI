
/**
 * Write a description of class TableroDeCompus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableroDeCompus
{
    private Computadora compu;
    private Computadora[][] matrizDeCompus;

    public TableroDeCompus(int filas, int columnas)
    {
        this.compu= compu;
        this.matrizDeCompus=new Computadora[filas][columnas];
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
