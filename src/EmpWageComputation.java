public class EmpWageComputation {
    private static int isPresent = 1;
    private static int isAbsent = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program.");
        int check = (int) (Math.floor(Math.random()*10)%2);
        if (check == isPresent){
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is absent.");
        }
    }
}
