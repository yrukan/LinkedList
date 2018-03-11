package by.htp.runner;

import java.util.LinkedList;
import java.util.List;
import by.htp.model.*;

public class MainApp {

	public static void main(String[] args) {

		Student student1 = new Student("Name1", "Surname1", 17, 2000);
		Student student2 = new Student("Name2", "Surname2", 18, 2001);
		Student student3 = new Student("Name3", "Surname3", 17, 2002);
		Student student4 = new Student("Name4", "Surname4", 18, 2003);
		Student student5 = new Student("Name5", "Surname5", 17, 2004);

		List<Student> list = new LinkedList<>();
		// add students
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);

		// delete student
		if (list.remove(student2))
			System.out.println("Student is deleted");
		

		// print students
		for (Student stud : list) {
			System.out.println(stud);
		}

		// search student
		System.out.println("Search results:");
		int count = 0;
		for (Student stud : list) {
			if (stud == student3) {				
				count++;
				System.out.println(count + " results found");
			}
		}
		if (count == 0)
			System.out.println("No results found");

	}

}
