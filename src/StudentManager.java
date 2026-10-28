import java.util.List;
import java.util.ArrayList;
public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public Student findStudent(String name){
        for(int i = 0 ; i < students.size() ; i++){
            if(name.equals(students.get(i).getName())){
                return students.get(i);
            }
        }
        return null;
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    public void updateStudent(Student student , String new_name , int new_age){
        student.setName(new_name);
        student.setAge(new_age);
    }
}
