/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kadyr
 */
public class PartTimeStudent extends Student {
   
    private int noOfCourses;

    public PartTimeStudent(int noOfCourses, String studentId, String StudentName) {
        super(studentId, StudentName);
        this.noOfCourses = noOfCourses;
    }

    public int getNoOfCourses() {
        return noOfCourses;
    }

    public void setNoOfCourses(int noOfCourses) {
        this.noOfCourses = noOfCourses;
    }
}
