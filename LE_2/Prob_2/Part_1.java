interface Animal {
    void makeVoice();
}
class Cow implements Animal {
    public void makeVoice() {
        System.out.println("Moo!");
    }
}

class Dog implements Animal {
    public void makeVoice() {
        System.out.println("Woof!");
    }
}

class Pig implements Animal {
    public void makeVoice() {
        System.out.println("Oink!");
    }
}

class Goat implements Animal {
    public void makeVoice() {
        System.out.println("Baa!");
    }
}

class Lion implements Animal {
    public void makeVoice() {
        System.out.println("Roar!");
    }
}
class Voice {
    Animal[] animals = new Animal[5];

    public void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    public void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

public class Part_1 {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
        voice.hear();
    }
}
