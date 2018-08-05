package moon.springbootdubbo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import moon.springbootdubbo.mapper.StudentMapper;
import moon.springbootdubbo.model.Student;
import moon.springbootdubbo.service.StudentService;

// 使用dubbo注解
@org.springframework.stereotype.Service
@Service(version = "1.0.0",timeout = 10000)
public class StudentrServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String sayHi(String name) {
        return "Hi SpringBootDubbo :" + name;
    }

    @Override
    public Student getStudent(Long id) {

        return studentMapper.selectByPrimaryKey(id);
    }
}
