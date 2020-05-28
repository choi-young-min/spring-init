package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.UserDAO;
import kr.re.kitri.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDao;

    public void registUser(User user) {
        userDao.insertUser(user);
    }
}
