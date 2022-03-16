package com.student.curdactivity.dao;


import com.student.curdactivity.entity.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> findAll();

    public Student findById(int id);

    public void save(Student student);

    public void deleteById(int id);
}
