import java.util.Scanner;

//comentario para probar git

class MiHilo implements Runnable /*extends Thread*/ {
    public MiHilo(String threadName) {
//        super(threadName);
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " está ejecutandose.");

            try {
                Thread.sleep(1000); // El hilo entra en estado de espera
//                if (this.getName() == "Hilo 2"){
//
//                    throw new RuntimeException("El hilo 2 se ha parado");
//                }
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            } catch (RuntimeException e) {
                System.out.println("Estoy en el catch: Hilo 2 se ha parado");
            } // try-catch
        } // for
    } // run
} // MiHilo

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("//n");

        MiHilo hilo1 = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");
        MiHilo hilo3 = new MiHilo("Hilo 3");

        Thread t1 = new Thread(hilo1);
        Thread t2 = new Thread(hilo2);
        Thread t3 = new Thread(hilo3);

        t1.start();
        t2.start();
        t3.start();

    } // String args
} // Main

