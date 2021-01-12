import employees.Employee;
import employees.Instructor;

class EmployeeStuff {
  public static void main(String[] args) {
    Employee e = new Employee("Luke Skywalker", 1, 40.00);
    System.out.println(e.getName() + " earns " + e.getMonthlyPay(160));

    Instructor i = new Instructor("Leia Organa", 2, 1000000, 9);
    System.out.println(i.getName() + " earns " + i.getMonthlyPay(160));
    System.out.println(i.deliverLecture());

    Employee ei = new Instructor("Rey", 3, 900000, 9);
    System.out.println(ei.getName() + " earns " + ((Instructor)ei).getMonthlyPay());
    System.out.println(((Instructor)ei).deliverLecture());
  }
}
