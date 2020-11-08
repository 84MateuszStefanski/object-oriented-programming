package gun;

public class GunFactory {

    public static ModuleGun foldingArms(Barrel barrel, Magazine magazine, Viewfinder viewfinder, RiffleButt riffleButt,
                                        GunSkeleton gunSkeleton) {
        ModuleGun moduleGun = new ModuleGun(gunSkeleton, barrel, magazine, viewfinder, riffleButt);
        return moduleGun;


    }


    public static void main(String[] args) {

        Barrel barrel11 = new Barrel("18FX", "Beretta", 100, 18, "No silencer");
        Magazine magazine1 = new Magazine("20MAG9M", "Heckler & Koch", 80, 20);
        Viewfinder viewfinder1 = new Viewfinder("Aiming site", "Heckler & Koch", 160, 0,
                "No thermovision", "Dot");
        GunSkeleton gunSkeleton1 = new GunSkeleton("SemiAuto2020FX", "Remington", 200,
                "Semi automatic pistol", 400, 16, "Carbon fieber");
        RiffleButt riffleButt = new RiffleButt("No riffle butt","No riffle butt",0,
                "No riffle butt",0);

            double price = barrel11.getPrice() + magazine1.getPrice() +
                    viewfinder1.getPrice() + riffleButt.getPrice() + gunSkeleton1.getPrice();
            System.out.println("The price for all set is " + price);


        System.out.println(foldingArms(barrel11, magazine1, viewfinder1, riffleButt, gunSkeleton1));
     

    }


}
