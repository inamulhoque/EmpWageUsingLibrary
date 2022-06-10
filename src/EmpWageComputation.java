public class EmpWageComputation {
    private static int isFullTime = 2;
    private static int isPartTime = 1;
    private static int isAbsent = 0;
    private static int empWagePerHr = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program.");
        int check = (int) (Math.floor(Math.random() * 10) % 3);
        int workHour = 0;
        if (check == isFullTime) {
            workHour = 8;
            System.out.print("Employee is present Full time and ");
        } else if (check == isPartTime) {
            workHour = 4;
            System.out.print("Employee is present Part time and ");
        } else {
            System.out.println("Employee is absent.");
        }
        int empWage = empWagePerHr * workHour;
        System.out.println("daily wage is: " + empWage);
    }
}
