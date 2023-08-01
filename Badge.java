import java.util.Random;
/*define a class Badge with:
a private static int variable called totalNumberOfEmployees (the value of this variable will be shared across multiple class instances)
a private String variable called badgeIdCode
a public Employee variable called employee
a private static void method called keepTrackOfEmployeesNumber() that increments by 1 the totalNumberOfEmployees
a private String method called generateBadgeIdCode() that returns a String containing name and surname of the employee between two random String codes (e.g. XYZNameSurnameZYX)
a public void method called showBadgeDetails() that informs the user about:
the total number of employee tracked by the badges
the details of the employee
the badgeIdCode
a constructor method that takes an Employee param called employeeThatNeedsBadge and:
call the static method for keeping track of the number of employees
assign the value of employeeThatNeedsBadge to the object's employee property
assign a generated id code to the object's badgeIdCode

 */
public class Badge{

    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){ totalNumberOfEmployees+=1;}

    public String generateBadgeIdCode(){
        Random random1 = new Random();
        String randomLetter1 = "XYZ";
        String randomLetter2 = "ZYX";
        return randomLetter1 + employee.getName() + employee.getSurname() + randomLetter2;
    }

    public void showBadgeDetails(){
        System.out.println("Total employee tracked by the badge : " +totalNumberOfEmployees);
        System.out.println("Employee detail : " + "Name : " + employee.getName() + " Surname: " + employee.getSurname() + " Address : " + employee.getAddress() );
        System.out.println("Badge ID code : " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }

    public static int getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }

    public String getBadgeIdCode() {
        return badgeIdCode;
    }

    public Employee getEmployee() {
        return employee;
    }
}
