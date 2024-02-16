package L17.In.animals;

public class Dog extends Animal {
    protected  String сolor;
    protected String breed;

    public Dog (int age, String name, String color, String breed){
        super(age, name);
        this.breed = breed;
        this.сolor = color;
    }
    public void voiceAnimal (){
        super.voiceAnimal();
        System.out.println(" Гав-гав ");
    }

    public String toString()
    {
        return super.toString() + "\n" + " Порода : " + this.breed + "\n"
                + " Цвет : " + this.сolor + "\n";
    }

}



