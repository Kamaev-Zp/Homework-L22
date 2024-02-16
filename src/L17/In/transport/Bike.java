package L17.In.transport;

public class Bike extends Transport {
    protected String model;

    public Bike (int age, String marka,  String model){
        super(age, marka);
        this.model = model;
    }
    public void soundTransport (){
        super.soundTransport();
        System.out.println(" Я мотоцикл откуда у меня AUX ");
    }

    public String toString()
    {
        return super.toString() +  "\n"
                + " Модель : " + this.model + "\n";
    }

}
