package lk.javaspringbootacadamy.demo.repository;

import lk.javaspringbootacadamy.demo.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
