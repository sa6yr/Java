class Student {
    private String name;
    private int age;
    private String major;

    // Әдепкі конструктор
    public Student() {
        this.name = "Аты белгісіз";
        this.age = 0;
        this.major = "Мамандану белгісіз";
        System.out.println("Әдепкі конструктор шақырылды");
    }

    // Параметрлі конструктор
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
        System.out.println("Параметрлі конструктор шақырылды");
    }

    // Ақпаратты шығару әдісі
    public void displayInfo() {
        System.out.println("Студенттің аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInfo();

        Student student2 = new Student("Айдар", 20, "Компьютерлік ғылымдар");
        student2.displayInfo();
    }
}
