public class Student extends Person{

    int study_level;
    String specialization;
    Double GPA;
    public Student(){
        super();
    }
    public Student(String n , int a , String ad , String nat , int level ,String special, Double gpa){

        super(n,a,ad,nat);
        study_level = level;
        specialization = special;
        GPA = gpa;
    }

    public int getStudy_level() {
        return study_level;
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }
}
