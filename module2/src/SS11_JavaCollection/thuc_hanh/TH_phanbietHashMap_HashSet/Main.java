package SS11_JavaCollection.thuc_hanh.TH_phanbietHashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("Nam", 20,"HN");
        Student student02 = new Student("Hung", 21, "HN");
        Student student03 = new Student("Ha", 22, "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student01);
        studentMap.put(2,student02);
        studentMap.put(3,student03);

        for (Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println(".......Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student01);

        for (Student student: students){
            System.out.println(student.toString());
        }
    }
}
