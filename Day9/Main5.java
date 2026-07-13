package Day9;

class MediaPlayer {
    void play() {
        System.out.println("Playing");
    }
}

class Audio extends MediaPlayer {
    void play() {
        System.out.println("Playing Audio");
    }
}

class Video extends MediaPlayer {
    void play() {
        System.out.println("Playing Video");
    }
}

public class Main5 {
    public static void main(String[] args) {
        MediaPlayer m = new Audio();
        m.play();

        m = new Video();
        m.play();
    }
}
