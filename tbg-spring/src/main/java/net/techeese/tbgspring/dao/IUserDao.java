package net.techeese.tbgspring.dao;

import net.techeese.tbgspring.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Integer> {
}
