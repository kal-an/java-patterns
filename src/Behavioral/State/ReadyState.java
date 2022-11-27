package Behavioral.State;

public class ReadyState extends State {

    public ReadyState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    void clickPlay() {
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    void clickNext() {
        player.nextSong();
    }

    @Override
    void clickPrevious() {
        player.previousSong();
    }
}
