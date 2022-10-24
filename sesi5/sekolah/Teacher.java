package sesi5.sekolah;
import java.util.ArrayList;

public class Teacher extends Person{
    private int numCourse;
    private ArrayList<String> courses;

    public Teacher(String name, String address){
        super(name, address);

    }

    public boolean addCourse(String course){
        //jika dalam arraylist ada yang sama maka matkul telah ada
        if(courses.contains(course)){
            System.out.println("matkul telah ada");
            return false;
        }

        //menambahkan
        numCourse++;
        courses.add(course);
        return true;
    }

    public boolean removeCourse(String course){
        //jika dalam arraylist tidak ada course maka tidak bisa menghapus matkul
        if(!courses.contains(course)){
            System.out.println("matkul yang akan dihapus tidak ada");
            return false;
        }

        //jika ada hapus
        numCourse--;
        courses.remove(course);
        return true;
        
    }


}
