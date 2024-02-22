package L17.In.people;

public interface Drawable {
   //Выводит активный поиск у мужчины и женщины
   void draw();

   //Выводить имя возраст с родительского класса, и так же переопределяется метод в дочерном классе
   void print();

   default void info() {
      System.out.println("Хороший человек");
   }
}
