package crearea_surprizelor;

import tipuri_de_surprize.Candies;
import tipuri_de_surprize.FortuneCookie;
import tipuri_de_surprize.ISurprise;
import tipuri_de_surprize.MinionToy;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

    private static Random random = new Random();

    private GatherSurprises(){
    }

    public static ISurprise gather(){

        int randomSurprise = random.nextInt(3);

        switch(randomSurprise){
            case 0:
               return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
        }
        return null;
    }

    public static ArrayList<ISurprise> gather(int n){

        ArrayList<ISurprise> newListOfSurprises = new ArrayList<>();
        for(int i = 0; i < n; i++){
            newListOfSurprises.add(gather());
        }
        return newListOfSurprises;
    }

}
