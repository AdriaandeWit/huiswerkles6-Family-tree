package org.example;

public class Pet {
    private String Name;
    private int age;
    private String species;
    private Person owner;

    public Pet(String name, int age, String species) {
        Name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
