package com.student.curdactivity.service;

import com.student.curdactivity.dao.StudentDAO;
import com.student.curdactivity.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
    public class StudentServiceImpl implements StudentService{

    private StudentDAO studentDAO;

    @Autowired
    public  StudentServiceImpl(StudentDAO theStudentDAO){
        studentDAO=theStudentDAO;
    }

    @Transactional
    public List<Student> findAll(){
        return studentDAO.findAll();
    }

    @Transactional
    public Student findById(int id){
        return studentDAO.findById(id);
    }

    @Transactional
    public void save(Student student){
      studentDAO.save(student);
    }

    @Transactional
    public void deleteById(int id){
        studentDAO.deleteById(id);
    }
}
