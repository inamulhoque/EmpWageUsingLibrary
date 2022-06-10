public class EmpWageComputation {
    static int empWagePerHr = 20;
    public static void main(String[] args) {
        int check = (int) (Math.floor(Math.random() * 10) % 3+1);
        int isFullTime = 2;
        int isPartTime = 1;
        int totalWorkDaysAMonth = 20;
        int workHour = 0;
        switch (check) {
            case 2:
                workHour = 8;
                System.out.print("Employee is present Full time and ");
                break;
            case 1:
                workHour = 4;
                System.out.print("Employee is present Part time and ");
                break;
            default:
                System.out.println("Employee is absent.");
        }
        int empWage = empWagePerHr * workHour *totalWorkDaysAMonth;
        System.out.println("daily wage is: " + empWage);
    }
}
