package idea.czq.lianxi.main;

public class Dog extends DogAndCat{


    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getYs()+"的狗在吃"+something);
    }
    public void look(){
        System.out.println("看家");
    }
}
