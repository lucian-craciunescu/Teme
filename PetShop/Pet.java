package org.example.PetShop;

public class Pet {
    private String name;
    private String species;
    private int age;
    Owner owner;

    public Pet(String name, String species, int age, Owner owner) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.owner = owner;
    }
    public String getName() {
        return name;
    }
   public String getSpecies() {
        return species;
   }
   public int getAge() {
        return age;
   }
   public Owner getOwner() {
        return owner;
   }
}
