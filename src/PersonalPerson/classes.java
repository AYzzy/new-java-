package PersonalPerson;

public class classes {
    public static void main(String[] args) {
        Cat cat = new Cat("Rose",2);
        cat.meow();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        Cat cat1 = new Cat("Kitten",3);
        cat1.meow();
        System.out.println(cat.getName());
    }

}
