import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbtCages = sc.nextInt();
        String zooName = sc.next();
        System.out.println(new ZooManagement(nbtCages, zooName));
        Animal lion = new Animal("Felidae", "lion", 5, true);
        Animal girafe = new Animal("Giraffidae", "girafe", 8, true);
        Animal crocodile = new Animal("reptiles", "crocodile", 95, false);
        Animal eagle = new Animal("birds", "eagle", 12, false);
        //constructors are more simple
        Animal[] animals = new Animal[25];
        animals[0] = lion;
        animals[1] = girafe;
        animals[2] = crocodile;
        animals[3] = eagle;

        Zoo myZoo = new Zoo(animals, "myZoo", "USA", 20);
        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        //the output is the same

        System.out.println(lion);
    }
}