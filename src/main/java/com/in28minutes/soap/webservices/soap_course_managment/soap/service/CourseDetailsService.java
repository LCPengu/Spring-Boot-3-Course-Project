package com.in28minutes.soap.webservices.soap_course_managment.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.soap.webservices.soap_course_managment.soap.bean.Course;

@Component
public class CourseDetailsService {
	
	public enum Status{
		SUCCESS, FAILURE;
	}
	
	private static List<Course> courses = new ArrayList<>();

	static {
		Course course1 = new Course(1, "Spring", "10 Steps");
		Course course2 = new Course(2, "Spring MVC", "10 Examples");
		Course course3 = new Course(3, "Spring Boot", "6k Students");
		Course course4 = new Course(4, "Maven", "Most popular maven course");

		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
	}

	public Course findById(int id) {
		for (Course course : courses) {
			if (course.getId() == id) {
				return course;
			}
		}
		return null;
	}

	public List<Course> findAll() {
		return courses;
	}

	public Status deleteById(int id) {
		Iterator<Course> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Course course = iterator.next();
			if (course.getId() == id) {
				return Status.SUCCESS;
			}
		}
		return Status.FAILURE;
	}
}
