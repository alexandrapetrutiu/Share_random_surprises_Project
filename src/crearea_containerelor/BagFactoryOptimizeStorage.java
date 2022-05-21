package crearea_containerelor;

import depozitarea_surprizelor.FIFO;
import depozitarea_surprizelor.IBag;
import depozitarea_surprizelor.LIFO;
import depozitarea_surprizelor.RANDOM;

public class BagFactoryOptimizeStorage implements IBagFactory{

    @Override
    public IBag makeBag(String type){

        switch(type){
            case "RANDOM":
                return new RANDOM();
            case "FIFO":
                return new FIFO();
            case "LIFO":
                return new LIFO();
            default:
                return null;
        }
    }
}
