package exercise1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("jack", 3, "boy", "german sheperd", 2);
        dog1.setAge(0);
        dog1.setAge(3);
        System.out.println(dog1.getAge());
        dog1.setWeight(0);

        Dog dog2 = new Dog("girl", "dalmacian");
        System.out.println(dog2);


    }
}
