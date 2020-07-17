package com.framework.respository;

import com.framework.entity.Student;

import java.util.Collection;

public interface StudentRespository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);

}
