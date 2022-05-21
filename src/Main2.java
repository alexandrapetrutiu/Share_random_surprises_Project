import crearea_surprizelor.GatherSurprises;
import impartirea_surprizelor.AbstractGiveSurprises;
import impartirea_surprizelor.GiveSurpriseAndApplause;
import impartirea_surprizelor.GiveSurpriseAndHug;
import impartirea_surprizelor.GiveSurpriseAndSing;
import tipuri_de_surprize.ISurprise;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        AbstractGiveSurprises randomBag1 = new GiveSurpriseAndHug("RANDOM", 2);
        System.out.println("====== random bag + hug ======");
        randomBag1.put(GatherSurprises.gather());
        randomBag1.put(GatherSurprises.gather());
        randomBag1.put(GatherSurprises.gather());
        randomBag1.put(GatherSurprises.gather());
        randomBag1.put(GatherSurprises.gather());
        randomBag1.put(GatherSurprises.gather());
        System.out.println();
        System.out.println("give() ->");
        randomBag1.give();
        System.out.println();
        System.out.println("giveAll() ->");
        randomBag1.giveAll();
        System.out.println();
        System.out.println("give() ->");
        randomBag1.give();
        System.out.println();

        System.out.println("====== random bag + applause ======");
        System.out.println("Adding some random surprises...");
        AbstractGiveSurprises randomBag2 = new GiveSurpriseAndApplause("RANDOM", 2);
        for(int i = 0; i < 4; i++){
            randomBag2.put(GatherSurprises.gather());
        }
        System.out.println();
        System.out.println("give() ->");
        randomBag2.give();
        System.out.println();
        System.out.println("The bag has " + randomBag2.getBag().size() + " surprises in it.");
        System.out.println();
//
        System.out.println("====== random bag + sing ======");
        AbstractGiveSurprises randomBag3 = new GiveSurpriseAndSing("RANDOM", 2);
        randomBag3.put(GatherSurprises.gather());
        randomBag3.put(GatherSurprises.gather());
        System.out.println();
        System.out.println("The bag has " + randomBag3.getBag().size() + " surprises in it.");
        System.out.println("And after adding the surprises from randomBag2 in it:");
        randomBag3.getBag().put(randomBag2.getBag());
        System.out.println("The bag has " + randomBag3.getBag().size() + " surprises in it.");
        System.out.println("giveAll() ->");
        randomBag3.giveAll();
//
        System.out.println();
        System.out.println("====== LIFO bag + hug ======");
        AbstractGiveSurprises lifoBag1 = new GiveSurpriseAndHug("LIFO", 1);
        System.out.println();
        ArrayList <ISurprise> s = GatherSurprises.gather(5);
        for(int i = 0; i < s.size(); i++){
            lifoBag1.put(s.get(i));
        }
        System.out.println();
        System.out.println("give() ->");
        lifoBag1.give();
        System.out.println("giveAll() ->");
        lifoBag1.giveAll();

        System.out.println();
        System.out.println("====== FIFO bag + sing ======");
        AbstractGiveSurprises fifoBag1 = new GiveSurpriseAndSing("FIFO", 0);
        fifoBag1.put(GatherSurprises.gather());
        fifoBag1.put(GatherSurprises.gather());
        fifoBag1.put(GatherSurprises.gather());
        fifoBag1.put(GatherSurprises.gather());
        System.out.println();
        System.out.println("The bag has " + fifoBag1.getBag().size() + " surprises in it.");
        System.out.println();
        System.out.println("give() ->");
        fifoBag1.give();
        System.out.println("giveAll() ->");
        fifoBag1.giveAll();
        System.out.println("give() ->");
        fifoBag1.give();
    }
}
