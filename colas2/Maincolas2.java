package colas2;
import java.util.Scanner;
public class Maincolas2 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        operacionesConPilaCircular();
    }


    public static void operacionesConPilaCircular() {
        System.out.print("Ingrese el tamaño de la cola a atender: ");
        int tamanio = scanner.nextInt();

        ColaCircular cola = new ColaCircular(tamanio);

        int opcion;
        do {
            System.out.println("\n--- OPCIONES ---");
            System.out.println("1. agregar compra de dulceria");
            System.out.println("2. cliente de dulceria atendido");
            System.out.println("3. Verificar si la cola de dulceria esta llena");
            System.out.println("4. Verificar si no hay clientes para atender");
            System.out.println("5. Mostrar el cliente a atender");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a encolar: ");
                    int valor = scanner.nextInt();
                    cola.encolar(valor);
                    break;

                case 2:
                    int eliminado = cola.desencolar();
                    if (eliminado != -1) {
                        System.out.println("Elemento desencolado: " + eliminado);
                    }
                    break;

                case 3:
                    if (cola.estaLlena()) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.println("La cola no está llena.");
                    }
                    break;

                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cola no está vacía.");
                    }
                    break;

                case 5:
                    int frente = cola.frente();
                    if (frente != -1) {
                        System.out.println("El frente de la cola es: " + frente);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
