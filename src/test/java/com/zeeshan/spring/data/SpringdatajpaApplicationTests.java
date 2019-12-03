package com.zeeshan.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.zeeshan.spring.data.entities.Product;
import com.zeeshan.spring.data.repos.ProductRepository;
@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1L);
		product.setName("Mac");
		product.setDescription("awesome");
		product.setPrice(1200d);
		repository.save(product);

	}

}
