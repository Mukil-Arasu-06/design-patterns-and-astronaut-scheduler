package Adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer = new AdvancedMediaPlayer();

    @Override
    public void play(String fileName) {
        advancedPlayer.playMP4(fileName);
    }
}


