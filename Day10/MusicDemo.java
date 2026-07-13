package Day10;

interface MusicSource {
    void play();
}

class SpotifyPlayer implements MusicSource {
    public void play() {
        System.out.println("Playing Spotify");
    }
}

class MusicSystem {
    MusicSource source;

    MusicSystem(MusicSource source) {
        this.source = source;
    }

    void start() {
        source.play();
    }
}

public class MusicDemo {
    public static void main(String[] args) {
        MusicSystem m = new MusicSystem(new SpotifyPlayer());
        m.start();
    }
}
