package tipuri_de_surprize;

import java.util.Random;

public class FortuneCookie implements ISurprise{

    private String message;
    private static Random random = new Random();
    private static final String[] messages = {"A bad workman always blames his tools.",
            "A chain is only as strong as its weakest link.",
            "A journey of thousand miles begins with a single step.",
            "All that glitters is not gold.",
            "He who asks is a fool for five minutes, but he who does not ask remains a fool forever.",
            "The only thing we should be afraid of is stopping completely.",
            "A man who cannot tolerate small misfortunes can never accomplish great things.",
            "Tell your friend your secret, and he will set his foot on your neck.",
            "By blackening another you do not whiten yourself.",
            "Those who know do not speak, those who speak do not know.",
            "The same dog that bit you in the morning will bite you in the evening.",
            "Tell me and I’ll forget; show me, and I may not remember; involve me, and I’ll learn.",
            "Some people put the best outside, some keep the best inside.",
            "Turn your face to the sun and the shadows fall behind you.",
            "Deal with the faults of others as gently as your own.",
            "He who has a why to live can bear almost any how.",
            "Silence is often misinterpreted but never misquoted.",
            "The wise understand by themselves; fools follow the reports of others.",
            "To know how to grow old is the master work of wisdom, and one of the most difficult chapters" +
                    " in the great art of living.",
            "One should speak little with others and much with oneself."};

    private FortuneCookie(String mess){
        this.message = mess;
    }

   public static FortuneCookie generate(){
        /*La apelul metodei generate(), metoda va genera un numar aleator
         si va alege elementul din array in consecinta. Ulterior, va crea o (noua) surpriza corespunzator.
         */
        //cred ca trebuie sa returneze un nou FortuneCookie care va fi stocat intr-un alt array din care vor fi extrase si daruite

      //  Random random = new Random();
        int n = random.nextInt(messages.length-1);
        String randomMessage = messages[n];
        System.out.println("A new FortuneCookie surprise was generated!");
        return new FortuneCookie(randomMessage);
    }

    @Override
    public void enjoy(){
        System.out.println("You received a FortuneCooke surprise! " +
                "The message inside the FortuneCookie is: " + "\"" + this.message + "\"");
    }

}
