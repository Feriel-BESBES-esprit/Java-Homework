package main;

import entities.SocieteArrayList;
import entities.Employee;
import entities.Department;
import entities.DepartmentHashSet;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        //departments , employees and messages are made with chatgpt , excuse my laziness professor !!

        Employee employe1 = new Employee(1, "Dupont", "Jean", "Informatique", "a");
        Employee employe2 = new Employee(2, "Martin", "Pierre", "Ressources Humaines", "b");
        Employee employe3 = new Employee(3, "Lemoine", "Sophie", "Informatique", "f");

        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\nRecherche employé avec le nom 'Dupont' : " + societe.rechercherEmploye("Dupont"));

        System.out.println("\nTrier les employés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTrier les employés par nom, département et grade :");
        societe.displayEmploye();

        societe.supprimerEmploye(employe2);
        System.out.println("\nAprès suppression de l'employé 'Martin' :");
        societe.displayEmploye();

        DepartmentHashSet ensembleDepartements = new DepartmentHashSet();

        Department d1 = new Department(1, "RH", 15);
        Department d2 = new Department(2, "Informatique", 30);
        Department d3 = new Department(3, "Finance", 10);
        Department d4 = new Department(4, "Marketing", 20);

        ensembleDepartements.ajouterDepartement(d1);
        ensembleDepartements.ajouterDepartement(d2);
        ensembleDepartements.ajouterDepartement(d3);
        ensembleDepartements.ajouterDepartement(d4);

        System.out.println("Liste des départements après ajout :");
        ensembleDepartements.displayDepartement();

        System.out.println("\nRecherche du département 'Informatique' :");
        System.out.println(ensembleDepartements.rechercherDepartement("Informatique"));

        System.out.println("\nRecherche du département 'Finance' par objet :");
        System.out.println(ensembleDepartements.rechercherDepartement(d3));

        ensembleDepartements.supprimerDepartement(d2);
        System.out.println("\nListe des départements après suppression de 'Informatique' :");
        ensembleDepartements.displayDepartement();

    }
}
