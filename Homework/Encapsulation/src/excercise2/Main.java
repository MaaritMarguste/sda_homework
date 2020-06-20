package excercise2;

import exercise1.Dog;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Pocket pocket1 = new Pocket(300);
        System.out.println(pocket1.getMoney());
        pocket1.setMoney(3500);
        System.out.println(pocket1.getMoney());
    }


}
