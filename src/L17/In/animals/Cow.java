package L17.In.animals;


public class Cow extends Animal {


    protected String сolor;
    protected  String breed;

        public Cow(int age, String name, String color, String breed) {
            super(age, name);
            this.breed = breed;
            this.сolor = color;
        }
    public void voiceAnimal (){
            super.voiceAnimal();
            System.out.println(" Му-му ");
    }

        public String toString() {
            return super.toString() + "\n" + " Порода : " + this.breed + "\n"
                    + " Цвет : " + this.сolor + "\n";
        }

    }
