package tn.esprit.gestionzoo.entities;

public class ZooManagement {
    int nbtCages ;
    String zooName ;
    public ZooManagement(int nbtCages, String zooName) {
        this.nbtCages = nbtCages;
        this.zooName = zooName;
    }
    public String toString (){
        return zooName + " comporte " + nbtCages+" cages.";
    }
}