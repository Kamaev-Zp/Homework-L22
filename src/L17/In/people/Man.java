package L17.In.people;


public class Man extends People implements Drawable {
    protected String status;
    protected String child;

    public Man(int age, String name, String status, String child) {
        super(age, name);
        this.status = status;
        this.child = child;

    }
    public String getName() {
        return this.name;
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("Мужчина");
        System.out.println("Ищю женщину желательно без денег ");
    }

    @Override
    public void print() {
        super.print(); // Выводим имя и возраст из родительского класса
        System.out.println( "Статус: " + this.status);
        System.out.println("Дети: " + this.child);
    }
}


//        public String toString ()
//        {
//            return super.toString() + "\n" + " Статус : " + this.status + "\n"
//                    + " Дети : " + this.child + "\n";
//        }
//
//    }



