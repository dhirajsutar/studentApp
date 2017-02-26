package com.app.utility;

import com.app.beans.Student;

import java.util.List;

/**
 * Created by Dhiraj on 2/26/2017.
 */
public interface StudentUtility {
    public List<Student> sortBasedOnStudentName(List<Student> studentList);
    public List<Student> sortBasedOnStudentRollNumber(List<Student> studentList);
    public List<Student> sortBasedOnStudentPercentages(List<Student> studentList);
}
