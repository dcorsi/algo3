package algo3;

public class Spam extends Observable {

    private String promocion;

    public void setPromocion(String promocion) {
        this.promocion = promocion;
        this.notifyObservers();
    }

    public String getPromocion() {
        return promocion;
    }

    @Override
    public String toString() {
        return promocion;
    }

}
