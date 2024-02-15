public class Main {
  public static void main(String[] args) {
    /*   Student student = new Student("ali",37,"cairo","eygpt",5,"IS",4.5);
        System.out.println(student.name);

      Employee se1 = new Salaried_Employee("ahmed", 37,"cairo","egypt",5000,"manager","leader",500,300);
      se1.get_salary();

      Employee e1 = new Salaried_Employee("mohamed", 35,"cairo","egypt",6000,"develop","front",10,1000);
      System.out.println(se1.get_salary());
      System.out.println(e1.get_salary());*/
//      Product p1 = new CD();
//      p1.getitemprice();

      //// Enumerated ////
      Course course = Course.Database;
      System.out.println(course.toString());
      System.out.println(course.ordinal());

      Course course1 = Course.Winter;
      System.out.println(course1.toString());
      System.out.println(course1.ordinal());
      System.out.println(course.compareTo(course1));
      System.out.println(course.equals(course1));

   }
}
