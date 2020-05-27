package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private ProductService service;


    @GetMapping("/products/{productId}")
    public Map<String,Object> getProductDetailsByProductId(
            @PathVariable int productId){
        System.out.println(productId);
        Product p = service.viewProductDetail(productId);
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("status","OK");
        result.put("data",p);
        return result;
    }

    @GetMapping("/products")
    public String getProducts(){
        //1. 요청 해석.. 요청파라미터 확보, 해더값을 확보

        //5. 결과값을 받아서 JSON 포맷을 만들어서 전송(응답)

        return service.retrieveProducts();
    }

    @GetMapping("/products/hello")
    public String hello(){
        return "hello";
    }
}
