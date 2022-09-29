package solid;

public class Winamp extends Reproductor {

    @Override
    public void reproducirVideo() {
        throw new RuntimeException("Winamp no puede reproducir video...");
    }
}
