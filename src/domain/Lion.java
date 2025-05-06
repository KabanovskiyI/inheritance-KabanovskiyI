package domain;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " ричить як лев!");
    }

    public void roar() {
        System.out.println(name + " гучно ричить, показуючи свою силу!");
    }
}
