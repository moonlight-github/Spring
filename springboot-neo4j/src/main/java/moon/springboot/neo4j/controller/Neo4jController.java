package moon.springboot.neo4j.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import moon.springboot.neo4j.entity.Actor;
import moon.springboot.neo4j.entity.Movie;
import moon.springboot.neo4j.repository.ActorRepository;
import moon.springboot.neo4j.repository.MovieRepository;

/**
 * @author 作者 moonlight
 * @version 创建时间：2018年7月23日 下午10:52:59 类说明 :
 */

@RestController
public class Neo4jController {

	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private ActorRepository actorRepository;

	@GetMapping("/neo4j/init")
	public String init() {
		// 清除所有电影数据
		movieRepository.deleteAll();
		// 清除所有演员
		actorRepository.deleteAll();

		// 构建3部电影
		Movie matrix1 = new Movie();
		matrix1.setTitle("西游记");
		matrix1.setYear("1999-03-31");

		Movie matrix2 = new Movie();
		matrix2.setTitle("红楼梦");
		matrix2.setYear("2003-05-07");

		Movie matrix3 = new Movie();
		matrix3.setTitle("三国演员");
		matrix3.setYear("2003-10-27");

		// 构建3个演员
		Actor keanu = new Actor();
		keanu.setName("张三");

		Actor laurence = new Actor();
		laurence.setName("李四");

		Actor carrieanne = new Actor();
		carrieanne.setName("王五");

		// 给电影添加角色
		matrix1.addRole(keanu, "孙悟空");
		matrix1.addRole(laurence, "猪八戒");
		matrix1.addRole(carrieanne, "沙和尚");

		matrix2.addRole(keanu, "林黛玉");
		matrix2.addRole(laurence, "贾宝玉");
		matrix2.addRole(carrieanne, "王熙凤");

		matrix3.addRole(keanu, "诸葛亮");
		matrix3.addRole(laurence, "刘备");
		matrix3.addRole(carrieanne, "张飞");

		// 存电影节点
		movieRepository.save(matrix1);
		movieRepository.save(matrix2);
		movieRepository.save(matrix3);

		return "保存成功";
	}

	@GetMapping("/neo4j/get")
	public String get() {
		// Movie movie = movieRepository.findByTitle("西游记");
		Iterable<Movie> findAll = movieRepository.findAll();
		StringBuilder sb = new StringBuilder();
		for (Movie movie : findAll) {
			sb.append(movie.toString());
		}

		return sb.toString();
	}

}
