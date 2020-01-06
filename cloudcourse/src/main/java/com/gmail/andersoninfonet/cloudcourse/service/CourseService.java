package com.gmail.andersoninfonet.cloudcourse.service;

import java.util.List;

import com.gmail.andersoninfonet.cloudcourse.model.Course;
import com.gmail.andersoninfonet.cloudcourse.model.Transaction;

public interface CourseService {
    List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}