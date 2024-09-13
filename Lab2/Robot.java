import java.util.Random;

public class Robot
{
  
    private String nombre;
    private int puntosVida;
    private int ataque;
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getPuntosVida(){
        return this.puntosVida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPuntosVida(int puntosVida){
        this.puntosVida = puntosVida;
    }
    
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    
    
    
    public Robot()
    {
        
    }


    public void atacar(Robot otroRobot){
        otroRobot.getPuntosVida() -= this.ataque;
        otroRobot.setPuntosVida(puntosVida) -= this.ataque;

    }

    public boolean estaVivo(){
        if(this.puntosVida>20) {
            return true;
        }else{
            return false;
        }
    }


}
