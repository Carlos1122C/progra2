package edu.uatf.tp2.lab1.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private static int count = 0;

    public Student(String firstName, String lastName, String email) {
        this.id = ++count;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() { return id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        if (firstName == null||firstName.isBlank()){
            throw new IllegalArgumentException("firtsName no puede ser vacio");
        }
        this.firstName = firstName;
    }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String fullName() {
        return firstName + " " + lastName;
    }
    public static int getTotalStudent() {
        return count;
    }

    public String print() {
        return("Nombre: " + this.fullName());
    }
}