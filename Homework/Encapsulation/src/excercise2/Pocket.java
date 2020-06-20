package excercise2;

public class Pocket {
    private Integer money;

    public Pocket(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        if(money <= 10) {
            return 0;
        }
        return money;
    }

    public void setMoney(Integer money) {
        if(money < 0) {
            System.out.println("Can't have less money than 0 in your pocket.");
        } else if(money > 3000) {
            System.out.println("I don't have enough space in my pocket for as much money");
        }
        this.money = money;
    }
}
