package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;
    public Student (String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }
    public String getName () {
        return name;
    }
    public String getGroup () {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getAverageGrade () {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    @Override
    public String toString () {
        return "Student {" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(group, student.group) &&
                Objects.equals(grades, student.grades);
    }
    @Override
    public int hashCode () {
        return Objects.hash(name, group, course, grades);
    }
    public static void removeLowGraders (Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }
    public static void promoteNextGrade (Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents (Set<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
