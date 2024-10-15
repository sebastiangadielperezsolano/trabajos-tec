package LISTAS;
import  java.util.List;
import  java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    List<String> lista01 = new ArrayList<>();

    public void crearLista() {


        lista01.add("palomitas");
        lista01.add("refresco");
        lista01.add("dulce1");

        for (String item : lista01) {
            System.out.println("" + item);
        }
    }

    public void tamanioLista() {
        lista01.size();
        System.out.println("el tamaño de la lista es de:" + lista01.size() + "elementos");
    }

    public void estaVacia() {
        if (lista01.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("La Lista no esta vacia");
        }
    }

    public void buscador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el elemento que desea buscar en la lista");
        String elemento = scanner.next();
        if (lista01.contains(elemento)) {
            System.out.println("el elemento es: " + elemento);
        } else {
            System.out.println("el elemento no existe");
        }
    }

    public void eliminar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que desea eliminar?\n" +
                "1. desea eliminar un elemento\n" +
                "2. desea eliminar la lista completa");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:System.out.println("ingrese el elemento que desea eliminar");
            String elemento = scanner.next();
            if (lista01.remove(elemento)) {
                System.out.println("el elemento eliminado es: " + elemento);
            }else{
                System.out.println("el elemento no existe");
            }
            break;
            case 2:lista01.clear();
            break;
        }
    }

    public void compararListas() {
        List<String> lista02 = new ArrayList<>();
        List<String> lista03 = new ArrayList<>();
        lista02.add("combo1");
        lista02.add("combo2");
        lista03.add("paquete de cumpleaños");
        lista03.add("paquete de escuela");
        if (lista02.equals(lista03)) {
            System.out.println("las listas son iguales");
        } else {
            System.out.println("las listas no son iguales");
        }
    }
}

