package L17.In.transport;

public class Transport {
    protected String marka;
    protected int age;

    public Transport(int age, String name){
        this.marka = name;
        this.age = age;
    }
    public void soundTransport (){
        System.out.println(" Есть Aux? ");
    }

    public String toString()
    {
        return  " Название : " + marka + "\n" + " Год : " + age;
    }
}

