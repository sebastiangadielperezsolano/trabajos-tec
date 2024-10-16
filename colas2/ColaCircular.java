package colas2;

public class ColaCircular {
    private int[]cola;
    private int frente;
    private int finalCola;
    private int tamanioCola;
    public ColaCircular(int tamanio) {
        this.tamanioCola = tamanio;
        cola = new int[tamanio];
        frente = -1;
        finalCola = -1;
    }
    public boolean estaVacia() {
        return frente == -1;
    }
    public boolean estaLlena(){
        return ((finalCola+1))% tamanioCola == frente;
    }
    public void encolar(int elemento) {
        if (estaLlena()){
            System.out.println("El cola esta llena");
            return;
        }
        if (estaVacia()) {
            frente=0;
        }
        finalCola=(finalCola+1)%tamanioCola;
        cola[finalCola]=elemento;
        System.out.println("el elemento se a agregado con exito");
    }
    public int desencolar(){
        if (estaVacia()){
            System.out.println("El cola esta vacia no se puede eliminar ningun elemento");
            return -1;
        }
        int elemento = cola[frente];
        if (frente==finalCola){
            frente= -1;
            finalCola=-1;
        }else{
            frente=(frente+1)% tamanioCola;
        }
        return elemento;
    }
    public int frente(){
        if (estaVacia()){
            System.out.println("El cola esta vacia");
            return -1;
        }
        return cola[frente];
    }
}
//Perez Mendoza Danna Johana
        //Toribio Santos Andres
        //Pérez Solano Sebastián Gadiel
