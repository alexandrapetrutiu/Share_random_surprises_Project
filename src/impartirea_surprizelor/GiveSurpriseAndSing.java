package impartirea_surprizelor;

public class GiveSurpriseAndSing extends AbstractGiveSurprises{

    public GiveSurpriseAndSing(String containter, int waitTime) {
        super(containter, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }

}
