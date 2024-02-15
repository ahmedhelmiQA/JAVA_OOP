public class Person {
    String name;
    int age;
    String address;
    String nationality;
    public Person(){
    }
    public Person(String n , int a , String ad , String nat){
        name = n;
        age = a;
        address = ad;
        nationality = nat ;
    }
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
       age = a;
    }
    public void setAddress(String ad) {
        address = ad;
    }
    public void setNationality(String nat) {
        nationality = nat;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getNationality() {
        return nationality;
    }
    public void print_all_detaials(){
        System.out.println("Name = " + name + "\nAge = " + age + "\nAddress = " + address + "\nNationality = " + nationality);
    }

}
