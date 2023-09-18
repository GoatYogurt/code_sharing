import java.util.Objects;

public class StudentManagement {
    static Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } else {
            return false;
        }
    }

    public static void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; ++i) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    public static String studentsByGroup() {
        String result = "";
        String[] groupNames = new String[10];

        for (Student student : students) {
            boolean flag = false;
            for (int j = 0; j < 10; ++j) {
                if (student != null) {
                    if (student.getGroup().equals(groupNames[j])) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                for (int j = 0; j < 10; ++j) {
                    if (groupNames[j] == null && student != null) {
                        groupNames[j] = student.getGroup();
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 10; ++i) {
            if (groupNames[i] != null) {
                result = result + groupNames[i] + "\n";
                for (Student student: students) {
                    if (student != null) {
                        if (student.getGroup().equals(groupNames[i])) {
                            result = result + student.getInfo() + "\n";
                        }
                    }
                }
                groupNames[i] = null;
            }
        }
        return result;
    }

    public static void remvoveStudent(Student s1) {
        for (Student student: students) {
            if (student.getID().equals(s1.getID())) {
                student = null;
            }
        }
    }

    /*public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", "22028311", "22028311@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "22028312", "22028312@vnu.edu.vn");
        s2.setGroup("K62CB");
        Student s3 = new Student("Nguyen Van C", "22028313", "22028313@vnu.edu.vn");
        s3.setGroup("K62CB");
        StudentManagement.addStudent(s1);
        StudentManagement.addStudent(s2);
        StudentManagement.addStudent(s3);
        System.out.println(StudentManagement.studentsByGroup());
    }*/
}
