package kr.re.kitri.hello.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.SQLInvalidAuthorizationSpecException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = SQLInvalidAuthorizationSpecException.class)
    public String hadleSQLInvalid(){
        return "dddddd";
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public String hadelArithmeticException(){
        return "0으로 나누는 에러가 발생";
    }

    @ExceptionHandler(value = SQLException.class)
    public String SqlException(){
        return "쿼리 문제 발생";
    }

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public String handelSyntax(){
        return "SQL syntax Error";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleAll(){
        return "기타등등 예외를 모두 여기서 잡아버립니다.";
    }

}
