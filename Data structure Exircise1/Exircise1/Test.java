public class Test {
    public static void main(String[] args) {

        // Test Loan
        Loan loan = new Loan();
        System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
        System.out.println("Total Payment: " + loan.getTotalPayment());

        // Test BMI
        BMI bmi = new BMI("Ali", 20, 150, 65);
        System.out.println("BMI: " + bmi.getBMI());
        System.out.println("Status: " + bmi.getStatus());

        // Test Course
        Course course = new Course("Java");
        course.addStudent("Ali");
        course.addStudent("Ahmed");
        course.addStudent("Hassan");

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Number of Students: " + course.getNumberOfStudents());
    }
}