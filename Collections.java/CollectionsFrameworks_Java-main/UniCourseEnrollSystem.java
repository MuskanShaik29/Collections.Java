import java.util.*;

class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }

    @Override
    public String toString() {
        return "Course{" +
                "Course Code='" + courseCode + '\'' +
                ", Course Name='" + courseName + '\'' +
                ", Credits=" + credits +
                '}';
    }
}

public class UniCourseEnrollSystem{
    public static void main(String[] args) {
        LinkedList<Course> courseList = new LinkedList<>();

       
        courseList.add(new Course("CS101", "Introduction to Programming", 4));
        courseList.add(new Course("MA102", "Calculus I", 3));
        courseList.add(new Course("PH103", "Physics Basics", 4));
        courseList.add(new Course("EN104", "English Composition", 2));

        
        System.out.println("Courses using Iterator:");
        Iterator<Course> iterator = courseList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        System.out.println("\nCourses using ListIterator (Forward & Backward):");
        ListIterator<Course> listIterator = courseList.listIterator();
        
        
        while (listIterator.hasNext()) {
            System.out.println("Forward: " + listIterator.next());
        }
        
        
        while (listIterator.hasPrevious()) {
            System.out.println("Backward: " + listIterator.previous());
        }
    }
}
