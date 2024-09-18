class Zoo {
    Animal [] animals;
	String name;
    String city;
	int nbrCages;
    Zoo (Animal [] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println("Name: " + name+" \nCity: " + this.city+" \nNbrCages: " + this.nbrCages);
    }
    public String toString (){
        return "Name: " + name+" | City: " + this.city+" | NbrCages: " + this.nbrCages;
    }

}