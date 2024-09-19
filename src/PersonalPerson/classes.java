package PersonalPerson;

public class classes {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="rose";
        cat.meow();
    }
    static class Cat {
        String name;
        void meow(){
            System.out.println(name + " meow....");
        }
    }
}
