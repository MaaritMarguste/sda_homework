package exercise1;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private Integer weight;

    public Dog(String name, int age, String gender, String race, Integer weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age can not be less than 0");
        }
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight <= 0) {
            System.out.println("weight can not be less than 0");
        }
        this.weight = weight;
    }
}
