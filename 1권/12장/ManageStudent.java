public class ManageStudent {

    public static void main(String[] args) {
//        Student student[] = null;
        ManageStudent manageStudent = new ManageStudent();
//        student = manageStudent.addStudent();
//        manageStudent.printStudents(student);
        manageStudent.checkEquals();
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX","ask@godofjava.com");
        return student;
    }

    public void printStudents(Student[] student) {
        for(Student data:student){
            System.out.println(data);
        }
    }

    public void checkEquals() {
        Student a = new Student("Min","seoul","010XXXXXXXX","ask@godofjava.com");
        Student b = new Student("Min","seoul","010XXXXXXXX","ask@godofjava.com");
        if(a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
