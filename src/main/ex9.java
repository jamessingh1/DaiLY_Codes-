
interface MediaPlayer {
    void play();
    void pause();
    void stop();
}

class AudioPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Audio Player: Playing music track...");
    }

    public void pause() {
        System.out.println("Audio Player: Music track paused.");
    }

    public void stop() {
        System.out.println("Audio Player: Music track stopped.");
    }
}

class VideoPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Video Player: Streaming high-definition video...");
    }

    public void pause() {
        System.out.println("Video Player: Video stream paused.");
    }

    public void stop() {
        System.out.println("Video Player: Video stream stopped.");
    }
}

public class ex9 {
    public static void main(String[] args) {

        AudioPlayer mp3 = new AudioPlayer();
        VideoPlayer mp4 = new VideoPlayer();

        mp3.play();
        mp3.pause();
        mp3.stop();

        System.out.println(); 

        mp4.play();
        mp4.pause();
        mp4.stop();
    }
}
