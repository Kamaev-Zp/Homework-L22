package L17.In.people;

public class People {
    String name;
    int age;

    public People(int age, String name){
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return  " Имя : " + name + "\n" + " Возраст : " + age;
    }
}

