package com.framework.respository.impl;

import com.framework.entity.Student;

import com.framework.respository.StudentRespository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRespoisityImpl implements StudentRespository {

    public static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        // 安装 Lombok 插件才可使用,否则报错
        studentMap.put(1L, new Student(1L, "张强", 24));
        studentMap.put(2L, new Student(2L, "刘刚", 34));
        studentMap.put(3L, new Student(3L, "张红", 44));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
