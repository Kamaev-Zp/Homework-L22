package L17.In.animals;
import java.util.Objects;
public class Animal {

    protected String name;
    protected int age;

    public Animal(int age, String name){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return age == animal.age && Objects.equals(name, animal.name);
    }


    public void voiceAnimal (){
        System.out.println(" Животное издает звук : ");
    }
    public String toString()
    {
        return  " Имя : " + name + "\n" + " Возраст : " + age;
    }
}
