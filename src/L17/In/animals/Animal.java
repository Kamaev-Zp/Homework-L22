package L17.In.animals;

public class Animal {

    String name;
    int age;

    public Animal(int age, String name){
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return  " Имя : " + name + "\n" + " Возраст : " + age;
    }
}
