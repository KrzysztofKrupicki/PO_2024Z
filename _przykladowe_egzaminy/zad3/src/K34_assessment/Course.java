package K34_assessment;

import java.util.Objects;

public class Course {
    private String subject;
    private String code;

    public Course(String subject, String code) {
        this.subject = subject;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(code, course.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
