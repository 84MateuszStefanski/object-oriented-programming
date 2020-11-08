package gun;

public class ModuleGun {

    private GunSkeleton skeleton;
    private Barrel barrel;
    private Magazine magazine;
    private Viewfinder viewfinder;
    private RiffleButt butt;

    public ModuleGun(GunSkeleton skeleton, Barrel barrel, Magazine magazine, Viewfinder viewfinder, RiffleButt butt) {
        this.skeleton = skeleton;
        this.barrel = barrel;
        this.magazine = magazine;
        this.viewfinder = viewfinder;
        this.butt = butt;
    }

    public GunSkeleton getSkeleton() {
        return skeleton;
    }

    public Barrel getBarrel() {
        return barrel;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public Viewfinder getViewfinder() {
        return viewfinder;
    }

    public RiffleButt getButt() {
        return butt;
    }

    @Override
    public String toString() {
        return "This module gun is made of " + skeleton +
                "with barrel " + barrel +
                "it has magazine " + magazine +
                " is equipped with viewfinder " + viewfinder +
                " and " + butt ;
    }
}
