package com.app.beans;

/**
 * Created by Dhiraj on 2/26/2017.
 */
public class Student {
    private int rollNumber;
    private String studentName;
    private Address studentAddress;
    private double percentages;

    public Student() {
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public double getPercentages() {
        return percentages;
    }

    public void setPercentages(double percentages) {
        this.percentages = percentages;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", studentName='" + studentName + '\'' +
                ", studentAddress=" + studentAddress +
                ", percentages=" + percentages +
                '}';
    }
}
