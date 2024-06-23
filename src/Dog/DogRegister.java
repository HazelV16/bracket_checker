package Dog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DogRegister {
    private List<Dog> dogList = new ArrayList<>();

    public void addDog(Dog dog) {
        dogList.add(dog);
    }

    public Dog getDog(int regNum) {
        for (Dog dog : dogList) {
            if (dog.getRegNum() == regNum) {
                return dog;
            }
        }
        return null;
    }

    public Dog deleteDog(int regNum) {
        Dog dogRemoved = null;
        for (Dog dog : dogList) {
            if (dog.getRegNum() == regNum) {
                dogRemoved = dog;
                break;
            }
        }
        if (dogRemoved != null) {
            dogList.remove(dogRemoved);
            return dogRemoved;
        }
        return null;
    }

    public Collection<Dog> getDogsWhoseNameContains(String charSequence) {
        List<Dog> dogNameMatch = new ArrayList<>();
        for (Dog dog : dogList) {
            if (dog.getName().contains(charSequence)) {
                dogNameMatch.add(dog);
            }
        }
        return dogNameMatch;
    }

    public void groupByBreed() {
        dogList.sort(new DogBreedComparator());
    }


    public Collection<Dog> getByCondition(DogCondition c) {
        List<Dog> dogNameMatch = new ArrayList<>();
        for (Dog dog : dogList) {
            if (c.satisfies(dog)) {
                dogNameMatch.add(dog);
            }
        }
        return dogNameMatch;
    }

    public List<Dog> getRegister() {
        return dogList;
    }

    @Override
    public String toString() {
        StringBuilder dogResult = new StringBuilder("Dog.Dog register: \n");
        for (Dog dog : dogList) {
            dogResult.append(dog.toString()).append("\n");
        }
        return dogResult.toString();
    }
}
