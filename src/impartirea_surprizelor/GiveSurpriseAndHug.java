package impartirea_surprizelor;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    public GiveSurpriseAndHug(String containter, int waitTime) {
        super(containter, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
