
// We can have other classes but they must not be public or hold main method
class Dog {

    String name;
    String Breed;
    int age;
//    public Dog (String username, String Breed, int age) {
//        this.name = username;
//        this.Breed = Breed;
//        this.age = age;
//    }
    public void sound() {
        System.out.print("Bow Bow");
    }
}

// This is the main public class of this file
public class ArrayOfObjects {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog();
        dogs[0].sound();
    }
}
