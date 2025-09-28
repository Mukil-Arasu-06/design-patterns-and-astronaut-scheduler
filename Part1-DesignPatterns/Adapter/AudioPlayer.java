package Adapter;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter adapter;

    @Override
    public void play(String fileName) {
        if(fileName.endsWith(".mp4")) {
            adapter = new MediaAdapter();
            adapter.play(fileName);
        } else {
            System.out.println("Playing MP3 file: " + fileName);
        }
    }
}
