package sometask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static sometask.Grade.A;
import static sometask.Grade.B;
import static sometask.Grade.C;
import static sometask.Grade.D;
import static sometask.Subject.History;
import static sometask.Subject.Maths;
import static sometask.Subject.Physics;

public class StudentUtil {

    static List<Student> students = new ArrayList<>();
    // Prepare data
    static {
        students.add(new Student("Ivanov", "114-d", Map.of(Physics, A, Maths, C, History, B)));
        students.add(new Student("Petrov", "125-a", Map.of(Physics, B, Maths, A, History, A)));
        students.add(new Student("Mihaylov", "145-a", Map.of(Physics, B, Maths, C, History, A)));
        students.add(new Student("Sidorov", "114-d", Map.of(Physics, C, Maths, A, History, C)));
        students.add(new Student("Volkov", "110-a", Map.of(Physics, A, Maths, A, History, D)));
    }

    static List<String> getStudentNamesWithMathA(List<Student> studentList) {
        return studentList.stream().filter(s -> A.equals(s.getExamGrades().get(Maths))).map(st -> st.getLastName()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> studentsWithMathsA = getStudentNamesWithMathA(students);
        System.out.println(studentsWithMathsA);
        System.out.printf("Number of students with grade 'A' for 'Maths' is %d", studentsWithMathsA.size());
    }
}
