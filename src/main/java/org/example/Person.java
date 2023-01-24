package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

private String name;
private String middleName;
private String lastName;
private String sex;
private int age;
private Person mother;
private Person father;
private  List<Person> siblings =new ArrayList<>();
    //methode 2
private  List<Person> children = new ArrayList<>();
private List<Pet> pets = new ArrayList<>();

private Person(){
        pets = new ArrayList<>();
        children = new ArrayList<>();
        siblings = new ArrayList<>();
    }

public void addParents(Person mother, Person father) {
    setMother(mother);
    setFather(father);
}
public void addChild(Person child){
        children.add(child);
}
public void addSibling(Person sibling){
    siblings.add(sibling);
}
public void addPet(Pet pet ){
    pets.add(pet);
}

public List<Person> getGrandChildren(){
    ArrayList<Person> grandChildren = new ArrayList<>();
    for (Person child : getChildren()){
        grandChildren.addAll(child.getChildren());
        }
    return grandChildren;
}
public List<Pet> getGrandChildrenPets(){
        ArrayList<Pet> gCPets = new ArrayList<>();
    for (Person child : getChildren()){
        gCPets.addAll(child.getPets());
        }
    return gCPets;
}
public List<Person> getAllNiece(){
    ArrayList<Person> allNiece = new ArrayList<>();

    for(Person sibling  : siblings){
        for(Person niece: sibling.getChildren()){
            if(niece.getSex().equals("vrouw")) {
                allNiece.add(niece);
            }else {
                System.out.println("there are no nieces");
            }

        }
    }
    return allNiece;
}
//met privete constructor
        public Person(String name, String middleName, String lastName, String sex, int age) {
        this();
            this.name = name;
            this.middleName = middleName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;

    }

//getters

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    //setters


    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
