package L17.In.transport;

public class Car extends Transport {
   protected String model;

    public Car (int age, String marka,  String model){
        super(age, marka);
        this.model = model;
    }
    public void soundTransport (){
        super.soundTransport();
        System.out.println(" Конечно! Держи брат! ");
    }
    public String toString()
    {
        return super.toString() +  "\n"
                + " Модель : " + this.model + "\n";
    }

}
