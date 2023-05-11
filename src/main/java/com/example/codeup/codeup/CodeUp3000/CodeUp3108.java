package com.example.codeup.codeup.CodeUp3000;

import java.util.*;

class  Student{
    private String code;
    private int testId;
    private String name;
    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public int getTestId() {
        return testId;
    }
    public String getName() {
        return name;
    }
}
public class CodeUp3108 {
    public List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name){
        return new Student(code, testId, name);
    }

    private boolean isDuplicated(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    private void addAStudent(Student student){
        if(!isDuplicated(student)) {
            students.add(student);
        }
    }

    private void removeStudent(Student pstudent) {
        for (Student student1 : students) {
            if (student1.getTestId() == pstudent.getTestId()) {
                students.remove(student1);
                return;
            }
        }
    }

    public void process(Student pStudent) {
        switch (pStudent.getCode()){
            case "I" -> addAStudent(pStudent);
            case "D" -> removeStudent(pStudent);
        }
    }

    public void printSpecificStudents(int[] arr){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getTestId() - s2.getTestId();
            }
        });

        for (int i = 0; i < 5; i++) {
            System.out.println(students.get(arr[i] - 1).getTestId() +" " +students.get(arr[i] - 1).getName());
        }
    }

    public void printStudents(){
        for(Student student : students)
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        CodeUp3108 codeUp3108 = new CodeUp3108();
        while(count-- > 0){
            String[] inputs = sc.nextLine().split(" ");
            String code = inputs[0];
            int testId = Integer.parseInt(inputs[1]);
            String name = inputs[2];
            Student student = codeUp3108.makeAStudent(code, testId, name);
            codeUp3108.process(student);
        }

        int[] indexes = new int[5];
        for (int i = 0; i < 5; i++) {
            indexes[i] = sc.nextInt();
        }
        codeUp3108.printSpecificStudents(indexes);
    }
}
