package L17.In.animals;

public class Animal {

    protected String name;
    protected int age;

    public Animal(int age, String name){
        this.name = name;
        this.age = age;
    }

    public void voiceAnimal (){
        System.out.println(" Животное издает звук : ");
    }
    public String toString()
    {
        return  " Имя : " + name + "\n" + " Возраст : " + age;
    }
}
