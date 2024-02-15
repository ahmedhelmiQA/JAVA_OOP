public abstract class Employee extends Person{

    int salary;
    String rank;
    String job;

    public Employee() {
    }

    public Employee(String n, int a, String ad, String nat, int sal, String rank, String j) {
        super(n, a, ad, nat);
        this.salary = sal;
        this.rank = rank;
        this.job = j;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int sal) {
        salary = sal;
    }

    public abstract int get_salary();

    @Override
    public void print_all_detaials() {
        super.print_all_detaials();
        System.out.println("Salary =" + salary + "\nRank =" + rank + "\nJop =" + job);
    }


}

