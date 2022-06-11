public class EmpWageComputation{
    public int empWage(String company, int empWagePerHr, int maxWorkDays, int maxWorkHour) {
        int days = 0;
        int workHour = 0;
        int totalWorkHr = 0;
        int empWage = 0;
        while (days < maxWorkDays && totalWorkHr < maxWorkHour) {
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
        System.out.println("Monthly wage of the employee of "+company+" is: "+ empWage);
        System.out.println("Total Work hour: "+totalWorkHr);
        System.out.println("Total days worked: "+days);
        return empWage;
    }
}
