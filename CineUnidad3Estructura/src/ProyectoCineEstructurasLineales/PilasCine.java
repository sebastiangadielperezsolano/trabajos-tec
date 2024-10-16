package ProyectoCineEstructurasLineales;

public class PilasCine {

    private int capacidad;
    private String[] arreglo;
    private int cima;

    public PilasCine(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new String[capacidad];
        this.cima = -1;
    }

    public void push(String elemento) {
        if (estaLlena()) {
            System.out.println("Error: La caja esta llena.");
            return;
        }
        cima++;
        arreglo[cima] = elemento;
        System.out.println("cantidad:" + elemento + " pesos ingresados");
    }

    public String pop() {
        if (estaVacia()) {
            System.out.println("Error: no hay dinero en la caja");
            return null;
        }
        String elemento = arreglo[cima];
        cima--;
        System.out.println("cambio es de:" + elemento + " pesos cambio");
        return elemento;
    }

    public String peek() {
        if (estaVacia()) {
            System.out.println("Error: la cja esta vacia");
            return null;
        }
        System.out.println("el ultimo pago fue de:" + arreglo[cima]);
        return arreglo[cima];
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == capacidad - 1;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La caja esta vacia");
            return;
        }
        System.out.print("montos de dinero ingresado ");
        for (int i = cima; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}