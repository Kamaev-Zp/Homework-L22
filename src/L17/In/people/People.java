package L17.In.people;

import L17.In.animals.Animal;

import java.util.Objects;

public abstract class People implements Drawable {
    protected String name;
    protected int age;

    public People(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
//        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        People people = (People) obj;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public void draw() {
        System.out.println("Активный поиск :");
    }
}
//    public String  toString()
//    {
//        return  " Имя : " + name + "\n" + " Возраст : " + age;
//    }
//}
//
