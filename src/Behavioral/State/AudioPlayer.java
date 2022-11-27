package Behavioral.State;

public class AudioPlayer {

    private State state;
    private UI volume;
    private UI playlist;
    private UI currentSong;

    public AudioPlayer() {
        this.state = new ReadyState(this);
        UI ui = new UI();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }

    public void startPlayback() {
    }

    public void stopPlayback() {
    }

    public void nextSong() {
    }

    public void previousSong() {
    }

    public void fastForward(int time) {
    }

    public void rewind() {
    }

    public boolean playing() {
        return true;
    }

}
