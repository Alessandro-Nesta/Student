import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的数量:");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.printf("请输入第%d个学生的姓名:%n" , i + 1);
            String name = sc.next();
            System.out.printf("请输入第%d个学生的年龄:%n" , i + 1);
            int age = sc.nextInt();
            manager.addStudent(new Student(name , age));
        }

        while(true){
            System.out.println();
            System.out.println("请输入要查找的学生姓名:");
            String request_name = sc.next();
            Student student = manager.findStudent(request_name);
            if(student == null){
                System.out.println("查无此人！是否需要继续查询？[y/n]");
                char c = sc.next().charAt(0);
                if(c == 'n'){
                    break;
                }
            }
            else{
                student.out();
                System.out.println("是否需要删除该学生的信息？[y/n]");
                char ch = sc.next().charAt(0);
                if(ch == 'y'){
                    manager.deleteStudent(student);
                    System.out.println("删除成功！");
                }
                System.out.println("是否需要继续查询？[y/n]");
                char choice = sc.next().charAt(0);
                if(choice == 'n'){
                    break;
                }
            }
        }
    }
}
