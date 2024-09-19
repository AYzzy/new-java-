package PersonalPerson;

public class classes {
    public static void main(String[] args) {
        Cat cat = new Cat("Rose",2);
        cat.meow();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        Cat cat1 = new Cat("jupiter");

        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
    }

}
