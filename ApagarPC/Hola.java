import java.io.*;

public class Hola {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            System.out.println("Codigo aceptado , iniciando ejecucion :)");
            runtime.exec("shutdown -s -t 2");
        } catch (IOException e) {
            System.out.println("Excepción: " + e);
        }
    }
}
