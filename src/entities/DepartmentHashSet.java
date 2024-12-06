package entities;

import interfaces.IDepartment;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartmentHashSet implements IDepartment<Department> {
    HashSet<Department> departments;

    public DepartmentHashSet() {
        departments = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Department department) {
        departments.add(department);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Department department : departments) {
            return nom.equals(department.getName());
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Department department) {
        for (Department dep : departments) {
            return dep.equals(department);
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Department department) {
        departments.remove(department);
    }

    @Override
    public void displayDepartement() {
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    @Override
    public TreeSet<Department> trierDepartementById() {
        TreeSet<Department> sortedDepartments = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedDepartments.addAll(departments);
        return sortedDepartments;
    }
}
