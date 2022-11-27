package Structural.Adapter;

public class Application {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);

        RoundPeg roundPeg = new RoundPeg(5);
        hole.fits(roundPeg);

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
//        hole.fits(smallSquarePeg); //ошибка, поскольку типы несовместимы

        SquarePegAdapter smallSAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println(hole.fits(smallSAdapter));
        System.out.println(hole.fits(largeSAdapter));
    }
}
