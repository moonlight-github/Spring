package moon.springboot.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import moon.springboot.jpa.config.JpaConfiguration;
import moon.springboot.jpa.entity.Dept;
import moon.springboot.jpa.entity.Role;
import moon.springboot.jpa.entity.User;
import moon.springboot.jpa.jpa.DeptRepository;
import moon.springboot.jpa.jpa.RoleRepository;
import moon.springboot.jpa.jpa.UserRepository;

/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月19日 下午11:47:03 
* 类说明 :
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfiguration.class)// 设置配置类
public class JpaTest {

	 private static Logger logger = LoggerFactory.getLogger(JpaTest.class);

	    @Autowired
	    UserRepository userRepository;

	    @Autowired
	    DeptRepository deptRepository;

	    @Autowired
	    RoleRepository roleRepository;
	
	    @Before
	    public void initData(){
	        // 清空数据
	        userRepository.deleteAll();
	        roleRepository.deleteAll();
	        deptRepository.deleteAll();

	        // 构造数据
	        Dept dept = new Dept();
	        dept.setName("开发部");
	        deptRepository.save(dept);

	        Assert.notNull(dept.getId(),"部门ID不能为空");


	        Role role = new Role();
	        role.setName("admin");
	        roleRepository.save(role);

	        Assert.notNull(role.getId(),"角色ID不能为空");


	        User user = new User();
	        user.setDept(dept);
	        user.setName("古乃亮");
	        user.setCreatedate(new Date());

	        List<Role> roles = new ArrayList<>();
	        roles.add(role);

	        user.setRoles(roles);

	        userRepository.save(user);

	        Assert.notNull(user.getId(),"用户ID不能为空");




	    }
	    @Test
	    public void findPage(){
	        Pageable pageable = new PageRequest(0,10,new Sort(Sort.Direction.ASC,"id"));

	        Page<User> page = userRepository.findAll(pageable);

	        Assert.notNull(page);

	        for (User user: page.getContent()) {
	            logger.info("====user=== user name:{},dept name:{},role name:{}",
	                    user.getName(),user.getDept().getName(),user.getRoles().get(0).getName());
	        }

	    }
}
