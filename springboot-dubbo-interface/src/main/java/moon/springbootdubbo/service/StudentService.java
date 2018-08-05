package moon.springbootdubbo.service;

import moon.springbootdubbo.model.Student;

public interface StudentService {

    public String sayHi(String name);


    public Student getStudent(Long id);

}
