package entities;

public class Department {
    private int id;
    private String name;
    private int nbrOfEmployees;
    public Department() {}
    public Department(int id, String name, int nbrOfEmployees) {
        this.id = id;
        this.name = name;
        this.nbrOfEmployees = nbrOfEmployees;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNbrOfEmployees() {
        return nbrOfEmployees;
    }
    public void setNbrOfEmployees(int nbrOfEmployees) {
        this.nbrOfEmployees = nbrOfEmployees;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department dep = (Department) o;
        return this.name.equals(dep.getName()) && this.id == dep.getId();
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name='" + name + '\'' + ", nbrOfEmployees=" + nbrOfEmployees + '}';
    }
}
