package tipuri_de_surprize;

import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise{

    private String[] candies;
    private static final String[] types = {"chocolate", "fruit", "almond", "vanilla", "fruit", "coconut"};
    private static Random random = new Random();

    private Candies(int candiesNo, String type){
        //numarul si tipul vor fi generate de metoda generate(), obiectul va fi creat prin generate, nu prin constructor
        this.candies = new String [candiesNo];
        Arrays.fill(candies, type);
    }

    @Override
    public void enjoy(){
        //Something about the candieSurprise - maybe their number and type
       // System.out.println("You received a Candie surprise! You've got " + candies.length + " " + candies[0] + " candies");
        System.out.println("You received a Candie surprise! You've got " + candies.length + "candies");
    }

    public static Candies generate(){
        /*metoda va genera 2 numere aleatoare, pentru a decide tipul bomboanelor (i.e. o surpriza contine un singur
          tip de bomboane) si respectiv numarul acestora. Ulterior, va crea o (noua) surpriza corespunzator.
         */
      //  Random random = new Random();
        int randomNo = random.nextInt(9);
        int n = random.nextInt(types.length-1);
        String randomType = types[n];
        System.out.println("A new Candie surprise was generated!");
        return new Candies(randomNo, randomType);
    }

}
