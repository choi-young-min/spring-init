package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDAO {
    void insertUser(User user);
}
