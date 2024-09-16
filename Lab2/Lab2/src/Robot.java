import java.util.Random;

public class Robot {
    private String nombre;
    private int puntosVida;
    private int ataque;


    public Robot(String nombre) {
        this.nombre = nombre;
        Random rand = new Random();
        this.puntosVida = rand.nextInt(51) + 50;  
        this.ataque = rand.nextInt(11) + 10;      
    }


    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosVida() {
        return this.puntosVida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void atacar(Robot otroRobot) {
        int vidaActual = otroRobot.getPuntosVida();
        otroRobot.setPuntosVida(vidaActual - this.ataque);
        System.out.println(this.nombre + " ataca a " + otroRobot.getNombre() + " causando " + this.ataque + " de daño.");
    }

    public boolean estaVivo() {
        return this.puntosVida > 0;
    }
}

