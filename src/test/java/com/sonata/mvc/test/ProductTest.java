package com.sonata.mvc.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import com.sonata.mvc.model.Product;
import com.sonata.mvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductTest {
    @Autowired
    public ProductRepository prepository;
    Optional<Product> p1;
    
      @Test
      public void getAllProductsTest(){





          List<Product> products = prepository.findAll();
            Assertions.assertThat(products.size()).isEqualTo(1);
            
            System.out.println(products);
        }
}