package L17.In.transport;


public class Bus extends Transport implements Drawable {
    protected  String model;

    public Bus (int age, String marka,  String model){
        super(age, marka);
        this.model = model;
    }

    @Override
    public void draw (){
        super.draw();
        System.out.println( "Модель: " + this.model);
    }
    @Override
    public void print (){
        super.print();
        System.out.println("Есть, ну не дам! ");
    }
//    public String toString()
//    {
//        return super.toString() +  "\n"
//                + " Модель : " + this.model + "\n";
//    }

}


