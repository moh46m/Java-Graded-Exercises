public class Course {
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    // Add a student
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] newStudents = new String[students.length * 2];

            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }

            students = newStudents;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Remove a student
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {

                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    public String[] getStudents() {
        String[] currentStudents = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            currentStudents[i] = students[i];
        }

        return currentStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}