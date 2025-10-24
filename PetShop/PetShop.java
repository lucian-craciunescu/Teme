package org.example.PetShop;

public class PetShop {
    public static void main(String[] args) {
        Owner owner = new Owner("Maria Ionescu", "0723123456");
        Pet pet = new Pet("Rex", "Câine", 3, owner);

        System.out.println("Pet " + pet.getName() + " (" + pet.getSpecies() + ", "
                + pet.getAge() + " ani), belongs to "
                + pet.getOwner().getName() + " (" + pet.getOwner().getPhoneNumber() + ").");
    }
}
