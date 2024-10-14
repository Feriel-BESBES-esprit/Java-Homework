import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom du zoo");
        String zooName = sc.nextLine();
        System.out.println("Entrer le nombre de cage");
        int nbCage = sc.nextInt();
        ZooManagement default_zoo = new ZooManagement();
        ZooManagement zoo = new ZooManagement(nbCage , zooName);

        System.out.println(default_zoo);
        System.out.println(zoo);

        sc.close();

    }
}