package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

    public String selectProducts() {
        //DB에 접속.. 쿼리
        //MyBatis..
        //.....
        return "상품목록 받으세요";
    }

    public Product selectProductById(int i) {
        //DB select
        Product p = new Product(
                i+"","아이폰11",50000,"ipone");
        return p;
    }
}
