package Homework5;

public class DemoPpl {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Student("Ivanka", 20, false, 4.5);
        people[1] = new Student("Bobi", 22, true, 3.8);
        people[2] = new Employee("Ganyo", 30, true, 100);
        people[3] = new Employee("Vanyo", 25, true, 120);
        people[4] = new Student("Borislava", 22, false, 3.8);
        people[5] = new Employee("Simeon", 25, true, 122);
        people[6] = new Employee("Desislav", 24, true, 70);
        people[7] = new Employee("Samoil", 23, true, 120);
        people[8] = new Employee("Krasi", 22, true, 105);
        people[9] = new Person("Chovek", 22, true);


        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
                double overtimePayment = ((Employee) person).calculateOvertime(8);
                System.out.println("Overtime Payment: " + overtimePayment);
            } else {
                person.showPersonInfo();
            }
            System.out.println();
        }
    }
}

