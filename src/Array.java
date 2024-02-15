import java.util.Scanner;

public class Array {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
/*


        System.out.println("Enter Size of Array");
        */
/*int size;
        size = input.nextInt();
        double [] salaries = new double[size];

        for (int i = 0; i<salaries.length; i++){
            System.out.println("Enter Salary for Employee" + (i+1));
            salaries[i] = input.nextDouble();
        }
        double sum=0  ;
        for (int i=0 ; i<salaries.length ; i++){
            sum = sum + salaries[i];
        }
        System.out.println("The sum of salaries is " + sum);
        System.out.println("the avrage of salaries is " + (sum/salaries.length));
        *//*


        int size;
        size = input.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter number" + (i + 1));
            numbers[i] = input.nextInt();
        }
        int sum = 0, count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
                count++;
            }
        }
        System.out.println("the average of numbers is " + sum / count);
*/

       System.out.println("Enter Size Of Array");
       int size = input.nextInt();
        int[] ids = new int[size];
        fillarray(ids);
        printarray(ids);

        System.out.println("Enter the id to search for");
      int searchedid = input.nextInt();
        int returnedindex = searchide(ids,searchedid);

        if (returnedindex>0){
            System.out.println("the item is found");
        }
        else
            System.out.println("the item is not found");
    }

    public static void fillarray(int[] list){
        for (int i =0 ; i< list.length; i++){
            System.out.println("Enter number" + (i+1));
            list[i] = input.nextInt();
        }
    }
    public static void printarray(int[] list){
        for (int i=0 ; i< list.length ; i++){
            System.out.println(list[i]);
               }
    }
    public static int searchide(int[] list , int target){
        for (int i=0 ; i< list.length ; i++)
            if (list[i] == target){
                return i;
            }
            return -1;
        }


}
