
/**
 * Esta clase es la que le da vida a la computadora, aqui se tendra todo lo relacionado con una computadora.
 * 
 * @author Stephanny Espinoza
 * @version 8/10/2021
 */

import java.util.Random;
public class Computadora
{
    private String objetoComputadora;
    private Random generador;
    private int anchoCompu;
    private int alto;

    // inicializa los atributos
    public Computadora()
    {
        this.generador=new Random();
        this.alto=1;
        this.anchoCompu=0;
        anchoCompu=this.generador.nextInt(2);
        this.objetoComputadora="alto*anchoCompu" ;
       
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
    
        
    public void setObjetoCompu(String matriz){
        this.objetoComputadora=matriz;
    } 
   
    public String getObjetoCompu(){
        return this.objetoComputadora;
    } 


}
