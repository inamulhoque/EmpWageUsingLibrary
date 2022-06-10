public class EmpWageComputation {
    private static int isPresent = 1;
    private static int empWagePerHr = 20;
    private static int isAbsent = 0;
    private static int fullDayHour = 8;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program.");
        int check = (int) (Math.floor(Math.random()*10)%2);
        if (check == isPresent){
            int empWage = empWagePerHr*fullDayHour;
            System.out.println("Employee is Present and daily wage is: "+empWage);
        } else {
            System.out.println("Employee is absent.");
        }
    }
}
