public class Student {
    private String name;
    private int age;

    public Student(String name , int age){
        this.name = name;
        setAge(age);
    }

    public void out(){
        System.out.println("姓名:" + name + " " + "年龄:" + age + "岁");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0 && age <= 100) {
            this.age = age;
        }
    }
}
