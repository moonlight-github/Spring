package moon.springboot.jpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moon.springboot.jpa.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept,Long> {
}
