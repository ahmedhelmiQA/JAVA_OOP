public class Hourly_Employee extends Employee{

    int working_hours;
    int hour_rat;

    public Hourly_Employee() {
    }

    public Hourly_Employee(String n, int a, String ad, String nat, int sal, String rank, String j, int work, int rat) {
        super(n, a, ad, nat, sal, rank, j);
        working_hours = work;
        hour_rat = rat;
    }

    @Override
    public int get_salary() {
        return working_hours * working_hours;
    }

    @Override
    public void print_all_detaials() {
        super.print_all_detaials();
        System.out.println("Working Hours = " + working_hours + "\nHour Rat =" + hour_rat);
    }
}
