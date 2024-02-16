package L17.In.people;

public class People {
    protected String name;
    protected int age;

    public People(int age, String name){
        this.name = name;
        this.age = age;
    }

    public void voice (){
        System.out.println(" Активный поиск :");
    }
    public String toString()
    {
        return  " Имя : " + name + "\n" + " Возраст : " + age;
    }
}

