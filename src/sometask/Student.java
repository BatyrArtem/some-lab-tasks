package sometask;

import java.util.Map;

public class Student {

    private String lastName;
    private String group;
    private Map<Subject, Grade> examGrades;

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public Map<Subject, Grade> getExamGrades() {
        return examGrades;
    }

    public Student(String lastName, String group, Map<Subject, Grade> examGrades) {
        this.lastName = lastName;
        this.group = group;
        this.examGrades = examGrades;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", group='").append(group).append('\'');
        sb.append(", examGrades=").append(examGrades);
        sb.append('}');
        return sb.toString();
    }
}
