/*Create a class called Person with private properties name and age. Implement public getter and setter methods to access and modify these properties. Use encapsulation to protect the internal state of the Person object.*/
class Person{
  private String name;
  private int age;
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
}
class PersonDemo{
  public static void main(String args[]){
    Person p=new Person();
    p.setName("Vinayak");
    p.setAge(23);
    System.out.println("Name is: "+p.getName());
    System.out.println("Age is: "+p.getAge());
  }
}