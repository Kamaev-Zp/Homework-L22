package L17.In.transport;

public class Car extends Transport {
   protected String model;

    public Car (int age, String marka,  String model){
        super(age, marka);
        this.model = model;
    }
    @Override
    public void draw(){
        super.draw();
        System.out.println( "Модель: " + this.model);

    }
    @Override
    public void print (){
        super.print();
        System.out.println("Конечно! Держи брат! ");
    }
    public String toString()
    {
        return super.toString() +  "\n"
                + " Модель : " + this.model + "\n";
    }

}
