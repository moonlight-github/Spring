package moon.springbootdubbo.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import moon.springbootdubbo.model.Student;
import moon.springbootdubbo.service.StudentService;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年8月3日 上午12:02:18 
* 类说明 :
*/

@RestController
public class StudentController {

	
	@Reference(version = "1.0.0")
	private StudentService studentService;
	
	@GetMapping("/dubbo/student/{id}")
	public Student getStudent(@PathVariable("id")Long id) {
		return studentService.getStudent(id);
	}
	
	@GetMapping("/dubbo/say")
	public String say() {
		return studentService.sayHi("我草");
	}
	
	
	
}
