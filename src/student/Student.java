
package student;

public class Student {
    private String studentId;
    private String StudentName;

    public Student(String studentId, String StudentName) {
        this.studentId = studentId;
        this.StudentName = StudentName;
 // end of constructor 
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    
    
    
} // end of class
