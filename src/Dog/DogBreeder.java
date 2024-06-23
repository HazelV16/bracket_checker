package Dog;

import java.util.Collection;

public class DogBreeder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting dog application");
        Dog.printTotal();
        Dog myDog1 = new Dog();
        System.out.println(myDog1);
        Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);
        System.out.println(myDog2);
        myDog1.setName("Fido");
        myDog1.addOwner("Anne");
        myDog1.addOwner("Bob");
//        myDog2.addOwners("Martha");
        System.out.println(myDog1);
        System.out.println(myDog1.getName());
        System.out.println(myDog2.getName());
        Dog.printTotal();
        DogRegister dogReg = new DogRegister();
//        Dog.Dog myDog1 = new Dog.Dog();
//        Dog.Dog myDog2 = new Dog.Dog("Fluffy", "Poodle", 3496);
        Dog myDog3 = new Dog("Fluffe", "Chihuahua", 1234);
        Dog myDog4 = new Dog("Katie", "Golden Retriever", 2345);
        Dog myDog5 = new Dog("Barry", "Border Collies", 6789);


        dogReg.addDog(myDog1);
        dogReg.addDog(myDog2);
        dogReg.addDog(myDog3);
        dogReg.addDog(myDog4);
        dogReg.addDog(myDog5);

        System.out.println(dogReg.toString());

//        dogReg.deleteDog(0);
//        System.out.println(dogReg.toString());

        Collection<Dog> dogNameMatch = dogReg.getDogsWhoseNameContains("Flu");
        for (Dog dog : dogNameMatch) {
            System.out.println(dog.toString());
        }

        dogReg.groupByBreed();
        System.out.println(dogReg.toString());

        DogCondition dc = new DogsNamedBarry();
        Collection<Dog> dogNameBarry = dogReg.getByCondition(dc);
        for (Dog dog : dogNameBarry) {
            System.out.println(dog.toString());
        }
    }
}
