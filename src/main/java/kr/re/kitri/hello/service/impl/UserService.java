package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.UserDAO;
import kr.re.kitri.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDao;

    public void registUser(User user) {
        userDao.insertUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }

    public User getUserDetails(String userid) {
        return userDao.selectUserByUserId(userid);
    }
}
