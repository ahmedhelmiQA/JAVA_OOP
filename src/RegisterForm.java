
////          Enumerated Types
enum Gender {Male, Female};
enum Course {Database, Winter,Fall,Spring};
enum Semester { Summer,Winter,Fall,Spring};
public class RegisterForm {

    String stname;
    Gender stdgender;
    Course crs;
    Semester sem;

    public RegisterForm(){
        stname = "ali";
        stdgender = Gender.Male;
        crs = Course.Database;
        sem = Semester.Spring;
    }
}
