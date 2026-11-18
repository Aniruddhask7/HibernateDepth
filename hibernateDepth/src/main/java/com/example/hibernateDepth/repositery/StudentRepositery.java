package com.example.hibernateDepth.repositery;

import com.example.hibernateDepth.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositery {

    @PersistenceContext
    private EntityManager entityManager;


    //save
    public void save(Student student) {
        entityManager.persist(student);
    }

    //find by id
    public Student findById(int id){
    return entityManager.find(Student.class , id);

    }

    //find all
    public List<Student> findAll() {
        return entityManager
                .createQuery("SELECT s FROM Student s", Student.class)
                .getResultList();
    }


    //delete
    public void remove(Student student){
        entityManager.remove(student);
        entityManager.flush();
    }




    //saveAll

    public void saveAll(List<Student>students){

        int counter = 0;
        for(int i=0;i<students.size();i++){
            Student student = students.get(i);
            entityManager.persist(student);
            counter++;

            if(counter %100 == 0){
                entityManager.flush();
                entityManager.clear();
            }
        }



    }








}
