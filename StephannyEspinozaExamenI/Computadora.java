
/**
 * Esta clase es la que le da vida a la computadora, aqui se tendra todo lo relacionado con una computadora.
 * 
 * @author Stephanny Espinoza
 * @version 8/10/2021
 */

import java.util.Random;
public class Computadora
{
    private int [][] matrizDeCompus;
    private Random generador;
    private int anchoCompu;

    // inicializa los atributos
    public Computadora(int filas, int columnas)
    {
        this.matrizDeCompus=new int [filas][columnas];
        this.generador=generador;
        this.anchoCompu=this.generador.nextInt(2);
    }
    
    public void setRandomGenerador(Random generadorP){
        this.generador=generadorP;
    } 
    
        
    public Random setRandomGenerador(){
        return this.generador;
    } 
    
        public void setAnchoCompu(int ancho){
        this.anchoCompu=ancho;
    } 
    
        
    public int getAnchoCompu(){
        return this.anchoCompu;
    } 
    
        
    public void setMatrizDeCompus(int [][] matriz){
        this.matrizDeCompus=matriz;
    } 
   
    public int [][] getMatrizDeCompus(){
        return this.matrizDeCompus;
    } 


}
