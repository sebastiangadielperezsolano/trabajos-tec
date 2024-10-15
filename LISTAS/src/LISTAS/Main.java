package LISTAS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        manuLista();
    }

    public static void manuLista() {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        int opcion;

        do {
            System.out.println("1.- para agregar un elemento a la lista\n" +
                    "2. ver el largo de la lista de espera \n" +
                    "3. verificar si no hay clientes \n" +
                    "4. buscar pedido del cliente \n" +
                    "5. cliente atendido \n" +
                    "6. comparar las listas \n" +
                    "7. finalizar program\n");

            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    lista.crearLista();
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
                    lista.compararListas();
                    break;
                case 7:
                    System.out.println("finalizar programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 7);

        scanner.close(); // Cierra el Scanner al final
        //Perez Mendoza Danna Johana
        //Toribio Santos Andres
        //Pérez Solano Sebastián Gadiel
    }
}
