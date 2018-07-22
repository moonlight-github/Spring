package moon.springboot.jpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moon.springboot.jpa.entity.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
