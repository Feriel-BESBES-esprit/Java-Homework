public class ZooManagement {
    int nbtCages ;
    String zooName ;
    ZooManagement(int nbtCages, String zooName) {
        this.nbtCages = nbtCages;
        this.zooName = zooName;
    }
    public String toString (){
        return zooName + " comporte " + nbtCages+" cages.";
    }
}