package pbo2.pkg10118079.latihan61.bangunruang;


public class Kerucut implements bangunDatar {
    private double tinggi;
    private double jariJari;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    

    @Override
    public double hitungVolume() {
        return Math.PI*(jariJari*jariJari)*(tinggi/3); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
