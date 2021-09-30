
public class EMP_WAGE {
        // Constants
        static final int IS_PART_TIME = 1;
        static final int IS_FULL_TIME = 2;
        static final int EMP_RATE_PER_HOUR = 20;
        static final int TOTAL_WORKING_DAYS = 20;

        public static void main(String[] args) {

             // Initializing variables
             int EmpWage = 0, empHrs = 0, TotalEmpWage = 0;

             // Computations
             for(int day = 0; day < TOTAL_WORKING_DAYS; day++) {
             int empCheck = (int)Math.floor(Math.random() * 10) % 3;

             switch (empCheck) {
             case IS_FULL_TIME:
                    empHrs = 8;
                    break;
             case IS_PART_TIME:
                    empHrs = 4;
                    break;
             default:
                    empHrs = 0;
             }

             EmpWage = empHrs * EMP_RATE_PER_HOUR;
             System.out.println("To Calculate Dailly Employee Wage: "+EmpWage);
             TotalEmpWage += EmpWage;
        }
        System.out.println("To Calculate Wages For a Month: "+TotalEmpWage);

	}

}
