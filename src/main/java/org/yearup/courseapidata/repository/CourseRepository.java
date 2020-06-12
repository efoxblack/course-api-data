package org.yearup.courseapidata.repository;

import org.springframework.data.repository.CrudRepository;
import org.yearup.courseapidata.model.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByTopicId(String topicId);

}
