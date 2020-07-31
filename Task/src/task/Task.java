/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;
import java.util.Scanner;

/**
 *
 * @author guizfinecodes
 */
class Student {
	String name;
	String stu_id;
	int score;
	public Student() {
		this(" ", " ", 0);
	}
	public Student(String initName, String initId, int initScore) {
		name = initName;
		stu_id = initId;
		score = initScore;
	}
}

public class Task {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Student Name, ID, Score respectively seperated by a space:");
		Student stu = new Student();
		Student max = new Student();
		Student min = new Student(" ", " ", 100);
		for (int i = 0; i < n; i ++) {
			stu.name = in.next();
			stu.stu_id = in.next();
			stu.score = in.nextInt();
			if (max.score < stu.score) {
				max.name = stu.name;
				max.stu_id = stu.stu_id;
				max.score = stu.score;
			}
			if (min.score > stu.score) {
				min.name = stu.name;
				min.stu_id = stu.stu_id;
				min.score = stu.score;
			}
		}
		System.out.println("name, ID of the highest score and the lowest score:");
		System.out.println(max.name + " " + max.stu_id);
		System.out.println(min.name + " " + min.stu_id);
		in.close();
	}
}

