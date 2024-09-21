package com.in28minutes.soap.webservices.soap_course_managment.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndPoint {

	public GetCourseDetailsResponse processCourseDeatilsRequest(GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		return response;
	}
}
