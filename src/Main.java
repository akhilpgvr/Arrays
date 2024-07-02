import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Array operations \n -----------------------------");
        Array_DS arr = new Array_DS();
        System.out.println("-----------------------------");
        arr.name = new String[]{"Akhil", "Abilash", "Aakash", "Ajay", "Hridesh"};
        System.out.println(Arrays.toString(arr.name));
        arr.age = new int[]{23, 23, 23, 22, 23};
        System.out.println(Arrays.toString(arr.age));
        System.out.println("-----------------------------");
        new Array_DS().printData(arr);
        System.out.println("-----------------------------");
        Student[] stu = new Student[4];
        stu[0] = new Student("Akhil", "BTech");
        stu[1] = new Student("Aakash", "BTech");
        stu[2] = new Student("Ajay", "MBA");
        stu[3] = new Student("Hridesh", "BTech");
        for(Student st: stu){
            System.out.println(st.name+ " = "+ st.course);
        }
        System.out.println("-----------------------------");
    }
}