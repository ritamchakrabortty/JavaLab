interface Sports {
    int sport_wt = 10; // Default value for sports weightage

    int get_sport_wt();
}

class Student {
    String name;
    int rollNo;
    String department;
    int marks1;
    int marks2;

    public Student(String name, int rollNo, String department, int marks1, int marks2) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
}

class Marks extends Student {
    int totalMarks;

    public Marks(String name, int rollNo, String department, int marks1, int marks2) {
        super(name, rollNo, department, marks1, marks2);
        totalMarks = marks1 + marks2;
    }

    void get_details() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }

    void put_details() {
        System.out.println("Total Marks: " + totalMarks);
    }
}

class Result extends Marks implements Sports {
    public Result(String name, int rollNo, String department, int marks1, int marks2) {
        super(name, rollNo, department, marks1, marks2);
    }

    public int get_sport_wt() {
        return sport_wt;
    }
}

class Main {
    public static void main(String[] args) {
        Result result = new Result("John", 123, "Computer Science", 85, 90);

        result.get_details();
        result.put_details();
        System.out.println("Sports Weightage: " + result.get_sport_wt());
    }
}
