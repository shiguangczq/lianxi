package idea.czq.lianxi.main;

public class Cat extends DogAndCat{
    public Cat(int age, String name) {
        super(age, name);
    }

    public void zls() {
        System.out.println("捉老鼠");
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getYs()+"的猫在吃"+something);
    }
}
