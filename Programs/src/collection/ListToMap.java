package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListToMap {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "ABC", 450, 360, "RVS"));
		list.add(new Student(2, "CDE", 260, 460, "PSNA"));
		list.add(new Student(3, "EFG", 350, 420, "SSM"));
		list.add(new Student(4, "GHI", 250, 400, "TCE"));


		Map<Integer, String> map = new HashMap<>();
		for(Student stu : list) {
			map.put(stu.getId(),stu.getName());
		}
		System.out.println(map);
		
		Map<String,List<Integer>> total = new HashMap<>();
		List<Integer> marks = new ArrayList<>();
		
		System.out.println("Enter Mark 1:");
		Scanner myObj1 = new Scanner(System.in); 
		int mark1 = myObj1.nextInt();
	    
		System.out.println("Enter Mark 2:");
		Scanner myObj2 = new Scanner(System.in); 
		int mark2 = myObj2.nextInt();
		
		Student object = new Student(1, "ABC", mark1, mark2, "RVS");
		marks.add(object.getMark1());
		marks.add(object.getMark2());
		total.put(object.getAcademy(), marks);
		System.out.println(total);

	}
		
}

class Student{
	
	int id;
	String name;
	int mark1;
	int mark2;
	String academy;
	
	public Student(int id, String name, int mark1, int mark2, String academy) {
		super();
		this.id = id;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.academy = academy;
	}
	
	public Student() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	} 
	
	
	
	
}

//Map<Integer, Student> map = list .stream().collect(Collectors.toMap(Student::getId, student -> student));

