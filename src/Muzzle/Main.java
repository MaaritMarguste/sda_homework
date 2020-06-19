package Muzzle;

public class Main {
    public static void main(String[] args) {

        Muzzle muzzle = new Muzzle(10, "brown");
        Dog dog = new Dog(muzzle);

        System.out.println(muzzle.toString());





    }
}
