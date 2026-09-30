package com.eshop;

import static org.assertj.core.api.Assertions.assertThat;

import com.eshop.product.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EshopApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void contextLoads() {
		assertThat(productRepository.findByActiveTrueOrderByNameAsc()).hasSize(5);
	}

}
