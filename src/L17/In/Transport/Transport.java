package L17.In.Transport;

public class Transport {
    String marka;
    int age;

    public Transport(int age, String name){
        this.marka = name;
        this.age = age;
    }
    public String toString()
    {
        return  " Название : " + marka + "\n" + " Год : " + age;
    }
}

