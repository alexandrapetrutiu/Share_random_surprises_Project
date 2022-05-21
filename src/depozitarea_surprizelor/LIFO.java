package depozitarea_surprizelor;

import tipuri_de_surprize.ISurprise;

import java.util.ArrayList;

public class LIFO implements IBag{

    private ArrayList<ISurprise> LIFO = new ArrayList<>();

    // adds a surprise in the bag
    @Override
    public void put(ISurprise newSurprise){
        LIFO.add(newSurprise);
    }

    // adds all the surprises from another IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    @Override
    public void put(IBag bagOfSurprises){
        while(!bagOfSurprises.isEmpty()){
            LIFO.add(bagOfSurprises.takeOut());
        }
    }

    // removes a surprise from the bag and returns it
    @Override
    public ISurprise takeOut(){
        if(this.isEmpty()){
            return null;
        }else{
            ISurprise theSurprise = LIFO.get(LIFO.size()-1);
            LIFO.remove(theSurprise);
            return theSurprise;
        }
    }

    // Checks if the bag is empty or not
    @Override
    public boolean isEmpty(){
        return LIFO.isEmpty();
    }

    // Returns the number of surprises
    @Override
    public int size(){
        return LIFO.size();
    }
}
