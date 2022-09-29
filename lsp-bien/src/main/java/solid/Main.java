package solid;

public class Main {

    public static void main(String[] args) {
        ReproductorDeAudioVideo r;
        r = new ReproductorDeAudioVideo();
        r.reproducirAudio();
        r.reproducirVideo();
        r = new VLC();
        r.reproducirAudio();
        r.reproducirVideo();
        r = new MediaPlayerClassic();
        r.reproducirAudio();
        r.reproducirVideo();
        ReproductorDeAudio a = new ReproductorDeAudio();
        a.reproducirAudio();
        a = new Winamp();
        a.reproducirAudio();
//      a.reproducirVideo(); // Esta línea directamente no compila
    }
}
