package ProyectoCineEstructurasLineales;

class Colas {
    private String[] elementos;
    private int frente;
    private int fin;
    private int tamanio;
    private int capacidad;

    public Colas(int capacidad) {
        this.capacidad = capacidad;
        elementos = new String[this.capacidad];
        frente = 0;
        fin = -1;
        tamanio = 0;
    }

    public void encolar(String elemento) {
        if (estaLlena()) {
            throw new RuntimeException("limite de pedidos completo");
        }
        fin = (fin + 1) % elementos.length;
        elementos[fin] = elemento;
        tamanio++;
    }

    public String desencolar() {
        if (estaVacia()) {
            throw new RuntimeException("no hay pedidos de dulceria");
        }
        String elemento = elementos[frente];
        frente = (frente + 1) % elementos.length;
        tamanio--;
        return elemento;
    }

    public boolean estaVacia() {
        return tamanio == 0;
    }

    public boolean estaLlena() {
        return tamanio == elementos.length;
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("no hay pedidos de dulceria");
            return;
        }
        System.out.print("los pedidos que faltan realizar son: ");
        for (int i = 0; i < tamanio; i++) {
            System.out.print(elementos[(frente + i) % elementos.length] + " ");
        }
        System.out.println();
    }


}
