interface Animal {
    void eat();
    void sound();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("The Dog is eating pedigree and bones.");
    }

    public void sound() {
        System.out.println("The Dog says: Woof! Woof!");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("The Cat is drinking milk and eating fish.");
    }

    public void sound() {
        System.out.println("The Cat says: Meow! Meow!");
    }
}

public class ex2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sound();

        System.out.println(); 

        Cat myCat = new Cat();
        myCat.eat();
        myCat.sound();
    }
}
