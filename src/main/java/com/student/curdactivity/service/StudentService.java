package com.student.curdactivity.service;


import com.student.curdactivity.entity.Student;

import java.util.List;

public interface StudentService
{
    public List<Student> findAll();

    public Student findById(int id);

    public void save(Student student);

    public void deleteById(int id);
}
