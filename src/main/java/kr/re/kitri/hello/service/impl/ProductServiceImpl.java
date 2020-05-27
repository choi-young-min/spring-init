package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.ProductDAO;
import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    public String retrieveProducts(){
        //service//2. 전체상품을 조회하는 작업 수행..
        //service//3. 데이터베이스(오라클) 접속
        //service//4. Query를 날린다. (select ...)
        //last 결과를 전달한다.
        return productDAO.selectProducts();
    }

    public Product viewProductDetail(int i) {
        return productDAO.selectProductById(i);
    }
}
