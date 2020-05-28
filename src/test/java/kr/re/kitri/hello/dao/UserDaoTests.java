package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Junit Test
@SpringBootTest
public class UserDaoTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testInsertUser(){
        User user = new User("kkkk","aaaa",30);
        userDAO.insertUser(user);
    }

    @Test
    public void testSelectAllUsers(){
        List<User> users = userDAO.selectAllUsers();
        //참이면 통과
        assertTrue(users.size()>0);
    }

    @Test
    public void testSelectUserByUserId(){
        String userid = "LEE";
        User user = userDAO.selectUserByUserId(userid);
        assertEquals("LEE",user.getUserId());
    }
}
