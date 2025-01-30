class Student {
    int studentID;
    String studentName;
    int age;
    char gender;
    char grade;
    int[] marks;

    public Student(int studentID, String studentName, int age, char gender, char grade, int[] marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Grade: " + grade);
        System.out.println("Total Marks: " + getTotalMarks());
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92}; 
        Student student = new Student(101, "John Appleseed", 20, 'M', 'A', marks);
        student.displayStudentDetails();
    }
}