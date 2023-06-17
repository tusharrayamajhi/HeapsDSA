import java.util.*;

public class compareto {

    static class Student implements Comparable<Student> {

        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student other) {
            return this.rank - other.rank;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("abc", 2));
        pq.add(new Student("xyz", 1));
        pq.add(new Student("d", 4));
        pq.add(new Student("null", 3));

        while (!pq.isEmpty()) {
            Student student = pq.poll();
            System.out.println(student.name + " " + student.rank);
        }
    }
}
