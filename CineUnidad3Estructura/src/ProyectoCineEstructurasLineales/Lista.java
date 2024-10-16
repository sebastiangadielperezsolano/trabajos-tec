package ProyectoCineEstructurasLineales;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Lista {
    Scanner scanner = new Scanner(System.in);
    List<String> lista=new ArrayList<>();
    public void crearlista(){
        for (String s : Arrays.asList("A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5", "D1", "D2", "D3", "D4", "D5", "E1", "E2", "E3", "E4", "E5")) {
            lista.add(s);
        }
        for (String item : lista){
            System.out.println(""+item);
        }
    }
    public void tamanioLista() {
        lista.size();
        System.out.println("el tamaño de la sala es del cine es de:" + lista.size() + "acientos");
    }
    public void estaVacia() {
        if (lista.isEmpty()) {
            System.out.println("Lista vacia la sala");
        } else {
            System.out.println("La sala no esta vacia");
        }
    }
    public void buscador() {
        System.out.println("ingrese el aciento que desea buscar en la sala");
        String elemento = scanner.next();
        if (lista.contains(elemento)) {
            System.out.println("el aciento es: " + elemento);
        } else {
            System.out.println("el aciento no existe");
        }
    }
    public void eliminar() {
        System.out.println("¿que aciento desea comprar?");
        String elemento = scanner.next();
        if (lista.contains(elemento)) {
            System.out.println("el aciento es: " + elemento);
            lista.remove(elemento);
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
