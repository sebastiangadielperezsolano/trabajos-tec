package ProyectoCineEstructurasLineales;

import java.util.Scanner;

public class MainCine {
    public static void main(String[] args) {
        menuTrabajadorCine();
        menuListasTickets();
        menuColasDulces();
        menuPilaCaja();
    }
    public static void menuTrabajadorCine() {
        Scanner sc = new Scanner(System.in);
        int opcionTrabajadorCine;
        do {
            System.out.println("""
                    1.- el area es tickets
                    2.- el area es dulceria
                    3.- el area es caja
                    4.- salir"""
            );
            opcionTrabajadorCine = sc.nextInt();
            switch (opcionTrabajadorCine) {
                case 1:menuListasTickets();break;
                case 2:menuColasDulces();break;
                case 3:menuPilaCaja();break;
                case 4:System.exit(0);break;
            }
        } while (true);
    }
    public static void menuListasTickets() {
        Lista lista=new Lista();
        Scanner scanner = new Scanner(System.in);
        int opcionListaTickets;
        do {
            System.out.println("""
                    1.- para agregar un elemento a la lista
                    2. ver el largo de la lista de espera\s
                    3. verificar si no hay clientes\s
                    4. buscar pedido del cliente\s
                    5. cliente atendido\s
                    6. finalizar programa
                    """);

            opcionListaTickets = scanner.nextInt();

            switch(opcionListaTickets) {
                case 1:
                    lista.crearlista();
                    break;
                case 2:
                    lista.tamanioLista();
                    break;
                case 3:
                    lista.estaVacia();
                    break;
                case 4:
                    lista.buscador();
                    break;
                case 5:
                    lista.eliminar();
                    break;
                case 6:
                    System.out.println("finalizar programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcionListaTickets != 6);
    }
        public static void menuColasDulces() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el tamaño de la cola a atender: ");
            int capacidad = scanner.nextInt();
            Colas cola = new Colas(capacidad);

            while (true) {
                System.out.println("\n1. agregar consumo del cliente");
                System.out.println("2. cliente atendido");
                System.out.println("3. Mostrar pedidos de dulceria");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

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
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
    }
    public static void menuPilaCaja() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de la pila: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();
        PilasCine pila = new PilasCine(capacidad);

        int opcion;
        do {
            System.out.println("\nOperaciones:");
            System.out.println("1. se ha agregado el cambio");
            System.out.println("2. se ha eliminado el cambio realizado");
            System.out.println("3. muestra el último cambio que se ha hecho");
            System.out.println("4. Muestra los cambios de edición");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); //
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a apilar: ");
                    String elemento = scanner.nextLine(); // Leer un String
                    pila.push(elemento);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.peek();
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
//Perez Mendoza Danna Johana
//Toribio Santos Andres
//Pérez Solano Sebastián Gadiel

