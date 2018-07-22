package moon.springboot.jpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moon.springboot.jpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
