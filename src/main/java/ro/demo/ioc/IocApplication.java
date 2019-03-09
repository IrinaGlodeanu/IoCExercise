package ro.demo.ioc;


public class IocApplication {

    public static void main(String[] args) {

        ArtistWithoutIoC artist = new ArtistWithoutIoC();

        System.out.println("---------------------------------------");

        Talent singing = new Sing();
        ArtistWithIoC singer = new ArtistWithIoC(singing);

        Talent dancing = new Dance();
        ArtistWithIoC dancer = new ArtistWithIoC(dancing);

        Talent painting = new Paint();
        ArtistWithIoC painter = new ArtistWithIoC(painting);


    }

}
