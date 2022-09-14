package generics;

public class PilaGenerica<T> {

    private T elementoTope;
    private PilaGenerica<T> restoPila;

    public PilaGenerica() {
        elementoTope = null;
        restoPila = null;
    }

    public void push(T elem) {
        PilaGenerica<T> aux = new PilaGenerica<>();
        aux.elementoTope = elementoTope;
        aux.restoPila = restoPila;
        restoPila = aux;
        elementoTope = elem;
    }

    public T pop() {
        T tope = elementoTope;
        if (restoPila != null) {
            elementoTope = restoPila.elementoTope;
            restoPila = restoPila.restoPila;
        }
        return tope;
    }
}
