class Student{
	String name;
	int age;
	Student(String n, int a ){
		name=n;
		age=a;
	}

	void display(){
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
}
}
public class Objectcode{
	public static void main(String[] args){
		Student s2 = new Student("POOJITHA",21);
		s2.display();
}
}

