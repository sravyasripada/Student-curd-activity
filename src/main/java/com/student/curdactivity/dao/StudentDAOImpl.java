package com.student.curdactivity.dao;

import com.student.curdactivity.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public class StudentDAOImpl implements StudentDAO
{
    private EntityManager entityManager;

    public StudentDAOImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }

    @Transactional
    public List<Student> findAll(){
        Session currentSession=entityManager.unwrap(Session.class);

        Query<Student> theQuery=currentSession.createQuery("from Student",Student.class);

        List<Student> students=theQuery.getResultList();


        return  students;

    }
    @Transactional
    public Student findById(int id){

        Session currentSession=entityManager.unwrap(Session.class);

        Student theStudent=currentSession.get(Student.class,id);

        return theStudent;
    }

    @Transactional
    public void save(Student student){
        Session currentSession=entityManager.unwrap(Session.class);

       currentSession.saveOrUpdate(student);

    }

    @Transactional
    public void deleteById(int theid){
        Session currentSession=entityManager.unwrap(Session.class);
        Query theQuery=currentSession.createQuery("delete from Student where id=:StudentId");
        theQuery.setParameter("StudentId", theid);
        theQuery.executeUpdate();
    }
}
