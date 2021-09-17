
class Outside {
   int outer_num = 1;

   // inner class
   public class Inside {
      public void print(int inner_num) {

         System.out.println(inner_num);
      }
   }

   public void message() {
      Inside callClass = new Inside();
      callClass.print(6);
   }

}

public class innerClasses {

   public static void main(String args[]) {
      // Instantiating the outer class
      Outside outer = new Outside();

      // Outside.Inside inner = outer.new Inside();
      outer.message();
      System.out.println(outer.outer_num);

      // Other way of accesing innner class
      Outside out = new Outside();
      Outside.Inside g = out.new Inside();
      g.print(5);
   }
}