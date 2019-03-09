package ro.demo.ioc;

public class ArtistWithoutIoC {

    private Talent myTalent;

    public ArtistWithoutIoC(){
        myTalent = new Sing();
        System.out.println(myTalent.perform());
    }

}
