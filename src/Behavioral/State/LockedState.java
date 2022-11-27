package Behavioral.State;

public class LockedState extends State {

    public LockedState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickLock() {
        if (player.playing()) player.changeState(new PlayingState(player));
        else player.changeState(new ReadyState(player));
    }

    @Override
    void clickPlay() {

    }

    @Override
    void clickNext() {

    }

    @Override
    void clickPrevious() {

    }
}
