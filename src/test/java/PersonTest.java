import org.example.Person;
import org.example.Pet;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void getNameReturnsName(){
       //arange
        Person person = new Person("Henk","josef", "man",45);

        // act
        String expected = person.getName();

        //assert
        assertEquals("Henk", expected);
    }
    @Test
    public void addChildToChildrenList(){
        //arange
        Person person = new Person("Hans","Beer","man",20);
        Person child = new Person("Fien","Beer", "Vrouw", 4);
        //act
        person.addChild(child);
        List <Person> expected = person.getChildren();
        //assert
        assertEquals(List.of(child),expected);
    }
@Test
public void addSiblingToSiblingList(){

        Person person = new Person("Arie", "beer","man",13);
        Person broer = new Person("Andre","beer", "man", 14);

        person.addSibling(broer);
        List<Person> expected = person.getSiblings();

        assertEquals(List.of(broer),expected);


}
    @Test
    public void addParentsToParents(){
        //arange
        Person person = new Person("Arie","Beer", "man", 15);
        Person mom = new Person("Yvonne","Beer", "vrouw",45);
        Person dad = new Person("Herman","Beer","man",50);
        //act
        person.addParents(mom,dad);

        //assert
        assertEquals(mom, person.getMother());
        assertEquals(dad, person.getFather());



    }
@Test
    public void addPetToPetsList(){
        //arange

        Pet dog = new Pet("Diesel", 4,"duitsendog");
        Person person = new Person("Henk", "willem", "beer","man",45);
        //act
    person.addPet(dog);

    List<Pet> expected = person.getPets();
        //assert
        assertEquals(List.of(dog),expected );

}
@Test
    public void getGrandChildren(){
        Person child3 = new Person("Peter", "Beer", "man ",2);
        Person son  = new Person("Ruud","Beer","man",4);
        Person child2 = new Person("Daniele", "Beer", "vrouw",6);
        Person dad = new Person("Henk", "Beer","man",45 );

        dad.addChild(son);
        son.addChild(child2);
        son.addChild(child3);



        assertEquals(2,dad.getGrandChildren().size());
}

    @Test
    public void getAllPetsOfTheGrandChildren(){
        Person dad = new Person("Henk", "Beer","man",80);
        Person C1 = new Person("Ruud","Beer","man",60);
        Person GC = new Person("Daniele", "Beer", "vrouw",30);

        Pet Dog1 = new Pet("Piet",5,"Border collie");
        Pet Dog2 = new Pet("Eco",8,"Border collie");
        Pet Puppy = new Pet("Float",1,"Blue merle");

        dad.addChild(C1);
        C1.addChild(GC);
        GC.addPet(Dog1);
        GC.addPet(Dog2);
        GC.addPet(Puppy);



        assertEquals(3, dad.getGrandChildrenPets().size());
}
@Test
    public void getAllNieces() {

    Person person= new Person("Mark","Beer", "man",55);
    Person uncle = new Person("Henk", "Beer", "man", 50);
    Person niece = new Person("Lisa", "Beer", "vrouw", 25);
    Person niece2 = new Person("June", "Beer", "vrouw", 23);
    Person niece3 = new Person("Marijn", "Beer", "vrouw", 21);
    Person nephew = new Person("Dylan", "Beer", "man", 22);
    Person nephew2 = new Person("Fans", "Beer", "man", 28);

    person.addSibling(uncle);
    uncle.addChild(niece);
    uncle.addChild(niece2);
    uncle.addChild(niece3);
    uncle.addChild(nephew);
    uncle.addChild(nephew2);


    assertEquals(3,person.getAllNiece().size());





}

}
