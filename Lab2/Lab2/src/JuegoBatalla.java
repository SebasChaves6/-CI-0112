import java.util.Random;
import java.util.Scanner;

public class JuegoBatalla {
    private Robot[] listaRobots;
    private int n;

    public JuegoBatalla(int cantidadRobots) {
        this.n = cantidadRobots;
        listaRobots = new Robot[n];
        inicializarRobots();
    }


    private void inicializarRobots() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre del robot " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            listaRobots[i] = new Robot(nombre);
        }
    }

    public void iniciarBatalla() {
        Random rand = new Random();

        while (robotsVivos() > 1) {
            for (int i = 0; i < n; i++) {
                if (listaRobots[i].estaVivo()) {
                    int objetivo;
                    do {
                        objetivo = rand.nextInt(n);
                    } while (objetivo == i || !listaRobots[objetivo].estaVivo());

                    listaRobots[i].atacar(listaRobots[objetivo]);

                    if (!listaRobots[objetivo].estaVivo()) {
                        System.out.println(listaRobots[objetivo].getNombre() + " ha sido destruido.");
                    }
                }
            }
        }
        mostrarGanador();
    }

    private int robotsVivos() {
        int vivos = 0;
        for (Robot robot : listaRobots) {
            if (robot.estaVivo()) {
                vivos++;
            }
        }
        return vivos;
    }

    public void mostrarGanador() {
        for (Robot robot : listaRobots) {
            if (robot.estaVivo()) {
                System.out.println("El ganador es: " + robot.getNombre());
                break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de robots (máximo 10): ");
        int cantidad = sc.nextInt();
        cantidad = Math.min(cantidad, 10);

        JuegoBatalla juego = new JuegoBatalla(cantidad);
        juego.iniciarBatalla();
    }
}
