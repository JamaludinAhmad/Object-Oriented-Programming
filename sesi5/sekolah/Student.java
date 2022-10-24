package sesi5.sekolah;

import java.util.ArrayList;

public class Student extends Person {
    private int numCourse;
    private ArrayList<String> course;
    private ArrayList<Integer> grades;

    public Student (String name, String address){
        super(name, address);
        
    }

    public void addCourseGrade(String course, int grade){
        this.course.add(course);
        this.grades.add(grade);
        numCourse++;
        
    }

    public void printGrades(){
        for(int i = 0; i < numCourse; i++){
            System.out.println("course: " + course.get(i) + " " + "grade: " + grades.get(i));
        }
    }

    public double getAverageGrade(){
        int jumlah = 0;
        for (int i = 0; i < numCourse; i++) {
            jumlah += grades.get(i);
        }

        return jumlah / numCourse;
    }

    public String toString(){
        super.toString();
        return
        "Jumlah matkul diambil : " + this.numCourse + 
        "\nRata-rata nilai : " + getAverageGrade();
    }
}
