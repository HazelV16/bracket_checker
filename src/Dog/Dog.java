package Dog;

import java.util.HashSet;
import java.util.Set;

public class Dog {
    public static int count = 0;
    private String name = "unknown";
    private String breed = "unknown";
    private int regNum = -1;
    private Set<String> owners;
    private int seqNum;

    public Dog() {
        this.name = name;
        this.breed = breed;
        this.regNum = regNum;
        this.owners = new HashSet<>();
        count++;
        seqNum = count;
    }

    public Dog(String name, String breed, int regNum) {
        this.name = name;
        this.breed = breed;
        this.regNum = regNum;
        this.owners = new HashSet<>();
        count++;
        seqNum = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }

    public static void printTotal() {
        System.out.println("Total number of dogs breed = " + getCount());
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String dogBreed) {
        this.breed = dogBreed;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeqNum() {
        return seqNum;
    }

    public Set<String> getOwners() {
        return owners;
    }

    public void setOwners(Set<String> owners) {
        this.owners = owners;
    }

    public void addOwner(String ownerName) {
        owners.add(ownerName);
    }

    @Override
    public String toString() {
        return "Dog " + getName() + ", Breed = " + getBreed() + ", #owners = " + getOwners().size() + ", Registration #: " + getRegNum() + ", Sequence #: " + getSeqNum();
    }
}
