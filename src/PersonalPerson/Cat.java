package PersonalPerson;

public class Cat {
    private String name;
    private int age;
    public Cat(String name,int age){
        this.age = age;
        this.name = name;
    }
    public Cat(String name){
        this.age = 0;
        this.name = name;
    }

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(){
        System.out.println(name + " meow....");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
