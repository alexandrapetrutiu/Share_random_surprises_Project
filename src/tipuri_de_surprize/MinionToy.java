package tipuri_de_surprize;

public class MinionToy implements ISurprise{

    private String name;
    private static final  String [] names = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static int i = 0;

    private MinionToy (String randomName){
        this.name = randomName;
    }

    @Override
    public void enjoy(){
        System.out.println("You received a MinionToy surprise! You've got " + this.name);
    }

    public static MinionToy generate(){
        String randomName = names[i];
        i++;
        if(i >= names.length)
            i = 0;
        System.out.println("A new MinionToy was generated!");
        return new MinionToy(randomName);
    }

}
