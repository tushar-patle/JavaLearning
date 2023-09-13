package com.tushar;

public class Vid55_AbstractClassesVsInterfaces {
    public static void main(String[] args) {
        Avon objAvon = new Avon();
        objAvon.hornK3g();
        objAvon.applyBreak(10);
        objAvon.speedUp(20);
        objAvon.hornMaihuna();
    }
}

interface Bicycle {
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface BlowHorn {
    void hornK3g();
    void hornMaihuna();
}

class Avon implements Bicycle, BlowHorn {

    public void applyBreak(int decrement) {
        System.out.println("Applying breaks, speed decreased by "+decrement);
    }

    public void speedUp(int increment) {
        System.out.println("Accelerating, speed increased by "+increment);
    }
    
    public void hornK3g() {
        System.out.println("K3G..K3G..K3G");
    }
    public void hornMaihuna() {
        System.out.println("MaiHuNa..MaiHuNa..MaiHuNa");
    }
}