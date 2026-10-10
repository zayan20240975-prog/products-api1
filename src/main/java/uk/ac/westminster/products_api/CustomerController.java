package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customrs")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id){
        Adress adress=new Adress("115 new cavendish street","london","w15 guw");
        return new Customer(id,"ada lovlace","ada@example.com",adress);
    }


}
