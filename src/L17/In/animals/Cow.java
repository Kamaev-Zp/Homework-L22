package L17.In.animals;


public class Cow extends Animal implements Drawable {


    protected String color;
    protected  String breed;

        public Cow(int age, String name, String color, String breed) {
            super(age, name);
            this.breed = breed;
            this.color = color;
        }
    @Override
    public void print() {
        System.out.println("Корова");
        super.print();
        System.out.println("Порода: " + breed);
        System.out.println("Цвет: " + color );
        }

        @Override
    public void draw (){
            super.draw();
            System.out.println("Му-му ");
    }

//        public String toString() {
//            return super.toString() + "\n" + " Порода : " + this.breed + "\n"
//                    + " Цвет : " + this.сolor + "\n";
//        }

    }
