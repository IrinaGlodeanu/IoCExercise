package ro.demo.ioc;

public class ArtistWithIoC {

    private Talent myTalent;

    public ArtistWithIoC(Talent talent){
        myTalent = talent;
        System.out.println(myTalent.perform());
    }

}
