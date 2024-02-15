public class Salaried_Employee extends Employee{

    int bouns;
    int deducation;
//
//    public Salaried_Employee() {
//    }

    public Salaried_Employee(String n, int a, String ad, String nat, int sal, String rank, String j, int b, int deducat) {
        super(n, a, ad, nat, sal, rank, j);
       bouns = b;
       deducation = deducat;
    }

     @Override
    public int get_salary(){
        return salary + bouns - deducation ;
    }

    @Override
    public void print_all_detaials() {
        super.print_all_detaials();
        System.out.println("Salary = " + salary + "\n Bouns = " + bouns + "\nDeducation = " + deducation );
    }
}
