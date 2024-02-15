package L17.In.transport;

public class Bike extends Transport {
    String model;

    public Bike (int age, String marka,  String model){
        super(age, marka);
        this.model = model;
    }

    public String toString()
    {
        return super.toString() +  "\n"
                + " Модель : " + this.model + "\n";
    }

}
