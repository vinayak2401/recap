/*Create a Java class called Employee with properties like name, age, and salary. Then create subclasses like Manager and Engineer, which inherit from Employee. Each subclass should have additional properties and methods specific to the role. For example, the Manager class can have a property called department and a method called approveLeave(), while the Engineer class can have a property called programmingLanguages and a method called writeCode(). Test the implementation by creating instances of different employee classes and accessing their properties and methods.*/
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}


class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void approveLeave() {
        System.out.println("Manager " + getName() + " approves leave.");
    }
}


class Engineer extends Employee {
    private String programmingLanguages;

    public Engineer(String name, int age, double salary, String programmingLanguages) {
        super(name, age, salary);
        this.programmingLanguages = programmingLanguages;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void writeCode() {
        System.out.println("Engineer " + getName() + " is writing code.");
    }
}