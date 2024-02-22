package L17.In.transport;

public class Bike extends Transport implements Drawable {
    protected String model;

    public Bike (int age, String marka,  String model){
        super(age, marka);
        this.model = model;
    }

    @Override
    public void draw() {
      super.draw();
        System.out.println( "Модель: " + this.model);

    }
    @Override
    public void print (){
        super.print();
        System.out.println("Я мотоцикл откуда у меня AUX ");
    }

//    public String toString()
//    {
//        return super.toString() +  "\n"
//                + " Модель : " + this.model + "\n";
//    }

}
