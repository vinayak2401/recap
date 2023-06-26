/*Create a base class called Person with properties name and age. Derive a class Student from Person with an additional property grade. Implement a method displayInfo() in the Person class to display the name and age, and override the displayInfo() method in the Student class to display the name, age, and grade.*/
class Person{
  private String name;
  private int age;
  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
  public void displayInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
  }
}
class Student extends Person{
  private String grade;
  public Student(String name,int age,String grade){
    super(name, age);
    this.grade=grade;
    
  }
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Grade: "+grade);
  }
}
class Main{
  public static void main(String args[]){
    Person p=new Person("Vinayak",23);
    p.displayInfo();

    Student s=new Student("Sakshin",22,"A");
    s.displayInfo();
  }
}