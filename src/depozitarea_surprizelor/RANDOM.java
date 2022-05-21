package depozitarea_surprizelor;

import tipuri_de_surprize.ISurprise;

import java.util.ArrayList;
import java.util.Random;

public class RANDOM implements IBag{

    private ArrayList<ISurprise> RANDOM = new ArrayList<>();
    private Random random = new Random();

    // adds a surprise in the bag
    @Override
    public void put(ISurprise newSurprise){
        RANDOM.add(newSurprise);
    }



    // adds all the surprises from another IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    @Override
    public void put(IBag bagOfSurprises){ //cat timp sunt surprize intr-un container apelam takeOut si le mutam pe toate
        while(!bagOfSurprises.isEmpty()){
            RANDOM.add(bagOfSurprises.takeOut());
        }
    }

    // removes a surprise from the bag and returns it
    @Override
    public ISurprise takeOut(){
        if(this.isEmpty()){
            return null;
        }else{
            int n = random.nextInt(this.RANDOM.size());
            ISurprise theSurprise = RANDOM.get(n);
            RANDOM.remove(theSurprise);
            return theSurprise;
        }
    }


    // Checks if the bag is empty or not
    @Override
    public boolean isEmpty(){
        return RANDOM.isEmpty();
    }

    // Returns the number of surprises
    @Override
    public int size(){
        return RANDOM.size();
    }
}
