public class EmpWageComputation {
    static int empWagePerHr = 20;
    public static void main(String[] args) {
        int isFullTime = 2;
        int isPartTime = 1;
        int workHour = 0;
        int days = 1;
        int hours = 1;
        int totalWorkHr = 0;
        int empWage = 0;
        while (days < 20 && totalWorkHr < 100) {
            int check = (int) (Math.floor(Math.random() * 10) % 3 + 1);
            switch (check) {
                case 2:
                    workHour = 8;
                    System.out.println("Employee is present Full time and ");
                    break;
                case 1:
                    workHour = 4;
                    System.out.println("Employee is present Part time and ");
                    break;
                default:
                    System.out.println("Employee is absent.");
            }
            days++;
            totalWorkHr = totalWorkHr + workHour;
            empWage = empWagePerHr * totalWorkHr;
        }
        System.out.println("Total Work hour: "+totalWorkHr);
        System.out.println("Total days: "+days);
        System.out.println("daily wage is: " + empWage);
    }
}
