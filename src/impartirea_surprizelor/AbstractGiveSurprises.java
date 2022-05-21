package impartirea_surprizelor;

import crearea_containerelor.BagFactoryOptimizeStorage;
import crearea_containerelor.IBagFactory;
import depozitarea_surprizelor.IBag;
import tipuri_de_surprize.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

    private IBag bag;
    private int waitTime;


    public AbstractGiveSurprises(String containerType, int waitTime) {
        IBagFactory bagFactory = new BagFactoryOptimizeStorage();
        this.bag = bagFactory.makeBag(containerType);
        this.waitTime = waitTime;
    }

    //poate e nevoie si de un getter?


    public IBag getBag() {
        return bag;
    }

    public void put(ISurprise newSurprise) {
        this.bag.put(newSurprise);
    }

    public void put(IBag surprises) {
        this.bag.put((ISurprise) surprises);
    }

    public void give() {
        if(this.isEmpty()){
            System.out.println("Sorry, the bag is Empty.");
        }else{
            this.bag.takeOut().enjoy();
            this.giveWithPassion();
        }
    }

    protected abstract void giveWithPassion();

    public void giveAll() {
        if(this.isEmpty()){
            System.out.println("Sorry, the bag is Empty.");
        }else {
            while (this.bag.size() > 0) {
                try {
                    TimeUnit.SECONDS.sleep(this.waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.bag.takeOut().enjoy();
                giveWithPassion();
            }
        }
    }

    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    @Override
    public String toString() {
        return this.bag.toString();
    }



}
