/*define a tester class where you:
create 2 new Employee objects
create their new 2 Badge
show to the user the 2 employees' badge details
*/
public class Test {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Maurizio" , "Covelli" , "Via Rossini 21");
        Employee employee2 = new Employee("Mario" , "Rossi" , "Via verdi 51");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
