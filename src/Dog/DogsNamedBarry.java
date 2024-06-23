package Dog;

public class DogsNamedBarry implements DogCondition {

    @Override
    public boolean satisfies(Dog dog) {
        return "Barry".equals(dog.getName());
    }
}
