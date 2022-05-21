package depozitarea_surprizelor;

import tipuri_de_surprize.ISurprise;

import java.util.ArrayList;

public class FIFO implements IBag{

    private ArrayList<ISurprise> FIFO = new ArrayList<>();

    // adds a surprise in the bag
    @Override
    public void put(ISurprise newSurprise){
        FIFO.add(newSurprise);
    }

    // adds all the surprises from another IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    @Override
    public void put(IBag bagOfSurprises){
        while(!bagOfSurprises.isEmpty()){
            FIFO.add(bagOfSurprises.takeOut());
        }
    }

    // removes a surprise from the bag and returns it
    @Override
    public ISurprise takeOut(){
        if(this.isEmpty()){
            return null;
        }else{
            ISurprise theSurprise = FIFO.get(0);
            FIFO.remove(theSurprise);
//        System.out.println("A new " + theSurprise + " was given." );
            return theSurprise;
        }
    }

    // Checks if the bag is empty or not
    @Override
    public boolean isEmpty(){
        return FIFO.isEmpty();
    }

    // Returns the number of surprises
    @Override
    public int size(){
        return FIFO.size();
    }
}
