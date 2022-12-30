import controler.*;
import model.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        StudentCreator sc = new StudentCreator();
        Student student1 = sc.Create("Ivanov", "Petro", "Stepanovich", Sex.male);
        Student student2 = sc.Create("Petrov", "Igor", "Alekseevich", Sex.male);
        System.out.println(student2.toString() + "\n");

        GroupCreator gc = new GroupCreator();
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        Group group = gc.Create(student1, studentList, "124-19-1");
        System.out.println(group.toString() + "\n");

        DepartmentCreator dc = new DepartmentCreator();
        ArrayList<Group> groupsList = new ArrayList<>();
        groupsList.add(group);
        Human headman = sc.Create("Kusko", "Viktor", "Aleksandrovich", Sex.male);
        Department department = dc.Create(headman, groupsList, "FIT");
        System.out.println(department.toString() + "\n");

        UniversityCreator uc = new UniversityCreator();
        ArrayList<Department> departmentList = new ArrayList<>();
        departmentList.add(department);
        Human rector = sc.Create("Omelyko", "Stepan", "Viktorovich", Sex.male);
        University university = uc.Create(rector, departmentList, "NTU DP");
        System.out.println(university.toString() + "\n");
    }
}