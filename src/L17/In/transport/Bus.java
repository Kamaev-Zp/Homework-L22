package L17.In.transport;


public class Bus extends Transport {
    protected  String model;

    public Bus (int age, String marka,  String model){
        super(age, marka);
        this.model = model;
    }
    public void soundTransport (){
        super.soundTransport();
        System.out.println(" Есть, ну не дам! ");
    }
    public String toString()
    {
        return super.toString() +  "\n"
                + " Модель : " + this.model + "\n";
    }

}


