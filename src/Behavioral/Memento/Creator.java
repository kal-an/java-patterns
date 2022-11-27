package Behavioral.Memento;

public class Creator {

    private String text;
    private String color;

    class Snapshot {

        private String text;
        private String color;

        public Snapshot(String text, String color) {
            this.text = text;
            this.color = color;
        }
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text, color);
    }

    public void restore() {
        
    }
}
