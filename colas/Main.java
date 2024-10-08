package colas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuCola();
    }


    public static void menuCola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la cola a atender: ");
        int capacidad = scanner.nextInt();
        Cola cola = new Cola(capacidad);

        while (true) {
            System.out.println("\n1. agregar consumo del cliente");
            System.out.println("2. cliente atendido");
            System.out.println("3. Mostrar pedidos de dulceria");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            String otro = scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el pedido del cliente con el nombre del cliente: ");
                    String varia = scanner.nextLine();
                    try {
                        cola.encolar(varia);
                        System.out.println(varia + " ha sido agregado el pedido");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        String elementoDesencolado = cola.desencolar();
                        System.out.println(elementoDesencolado + " ha sido atendido el cliente.");
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}