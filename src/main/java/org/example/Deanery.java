package org.example;

import java.util.*;


public class Deanery {
    public static int START_COURSE = 1;
    public static int FINISH_COURSE = 5;

    private List<Student> students;
    private List<Student> graduates;

    public Deanery() {
        students = new LinkedList<>();
        graduates = new LinkedList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getGraduates() {
        return graduates;
    }

    public void setGraduates(List<Student> graduates) {
        this.graduates = graduates;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void fillStudentsList() {
        students.add(new Student("Савин Роман Александрович", 5, "Gr550"));
        students.add(new Student("Володин Артем Витальевич", 4, "Gr440"));
        students.add(new Student("Федин Игнат Игнатьевич", 3, "Gr330"));
        students.add(new Student("Пронин Илья Ильич", 2, "Gr220"));
        students.add(new Student("Соловьев Александр Анатольевич", 1, "Gr110"));
        students.add(new Student("Меньшиков Олег Владимирович", 5, "Gr550"));
        students.add(new Student("Куринков Радион Константинович", 4, "Gr440"));
        students.add(new Student("Петухов Владимир Олегович", 3, "Gr330"));
        students.add(new Student("Сасов Виктор Александрович", 2, "Gr220"));
        students.add(new Student("Воробьев Андрей Иванович", 1, "Gr110"));
        students.add(new Student("Рудченко Николай Васильевич", 5, "Gr550"));
        students.add(new Student("Васильков Влад Дмитрович", 4, "Gr440"));
    }

    public void fillStudentsSummaryList() {
        for (Student student : students) {
            student.fillSummaryList();
        }
    }

    public void printStudentsInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void printGraduatesInfo() {
        for (Student graduate : graduates) {
            System.out.println(graduate);
        }
        System.out.println();
    }

    public void makeDecision() {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (averageMark(student) >= 3) {
                student.updateCourse();
                if (student.isGraduate()) {
                    iterator.remove();
                    graduates.add(student);
                } else {
                    iterator.set(student);
                }
            } else {
                iterator.remove();
            }
        }
    }

    public double averageMark(Student student) {
        double averageMark = 0;
        for (Integer integer : student.getResults().values()) {
            averageMark += integer;
        }
        averageMark /= student.subjectsNumber();
        return averageMark;
    }
}