package L17.In.people;


public class Man extends People {
    protected String status;
    protected String child;

    public Man(int age, String name, String status, String child) {
        super(age, name);
        this.status = status;
        this.child = child;

    }

    public void voice() {
        super.voice();
        System.out.println(" Ищю женщину желательно без денег ");}


        public String toString ()
        {
            return super.toString() + "\n" + " Статус : " + this.status + "\n"
                    + " Дети : " + this.child + "\n";
        }

    }



