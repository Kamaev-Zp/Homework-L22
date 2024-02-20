package L17.In.animals;


public class Cat extends Animal {
    protected String сolor;
    protected String breed;

    public Cat (int age, String name, String color, String breed){
        super(age, name);
        this.breed = breed;
        this.сolor = color;
    }
    public void voiceAnimal (){
        super.voiceAnimal();
        System.out.println(" Мяу-Мяу ");
    }
     public void Attack (){
        System.out.println("Nakonec");
    }

    public String toString()
    {
        return super.toString() + "\n" + " Порода : " + this.breed + "\n"
                + " Цвет : " + this.сolor + "\n";
    }

}


