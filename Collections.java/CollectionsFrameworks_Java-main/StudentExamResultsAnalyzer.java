import java.util.*;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Student{" + "ID=" + id + ", Name='" + name + "'}";
    }
}

public class StudentExamResultsAnalyzer {
    public static void main(String[] args) {
        HashMap<Integer, Integer> studentResults = new HashMap<>();
        TreeMap<Integer, Integer> sortedResults = new TreeMap<>();
        
       
        studentResults.put(101, 85);
        studentResults.put(102, 90);
        studentResults.put(103, 78);
        studentResults.put(104, 88);

        sortedResults.putAll(studentResults);

        
        System.out.println("Student Exam Results (Unordered - HashMap):");
        for (Map.Entry<Integer, Integer> entry : studentResults.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " -> Score: " + entry.getValue());
        }

       
        System.out.println("\nStudent Exam Results (Sorted - TreeMap):");
        for (Map.Entry<Integer, Integer> entry : sortedResults.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " -> Score: " + entry.getValue());
        }
        
        int maxScore = Collections.max(studentResults.values());
        int minScore = Collections.min(studentResults.values());
        
        System.out.println("\nHighest Score: " + maxScore);
        System.out.println("Lowest Score: " + minScore);
    }
}
