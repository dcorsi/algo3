package solid;

public class Main {

    public static void main(String[] args) {
        Reproductor r;
        r = new Reproductor();
        r.reproducirAudio();
        r.reproducirVideo();
        r = new VLC();
        r.reproducirAudio();
        r.reproducirVideo();
        r = new MediaPlayerClassic();
        r.reproducirAudio();
        r.reproducirVideo();
        r = new Winamp();
        r.reproducirAudio();
        r.reproducirVideo();
    }
}
