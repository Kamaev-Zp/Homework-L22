package L17.In.Anamial;


import L17.Animal;

public class Cow extends Animal {


        String сolor;
        String breed;

        public Cow(int age, String name, String color, String breed) {
            super(age, name);
            this.breed = breed;
            this.сolor = color;
        }

        public String toString() {
            return super.toString() + "\n" + " Порода : " + this.breed + "\n"
                    + " Цвет : " + this.сolor + "\n";
        }

    }
