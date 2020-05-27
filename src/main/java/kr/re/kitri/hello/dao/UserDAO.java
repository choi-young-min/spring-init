package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    public User insertUser(User user) {
        System.out.println("insert ok....");
        return user;
    }
}
