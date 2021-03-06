package xzy.ify.dao.pojo.service;

import xzy.ify.dao.pojo.Student;

import java.util.List;

/**
 * Created by Neuedu on 2020/2/18.
 */
public interface IstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
