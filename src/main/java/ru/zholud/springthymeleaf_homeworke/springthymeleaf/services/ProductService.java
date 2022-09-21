package ru.zholud.springthymeleaf_homeworke.springthymeleaf.services;


import org.springframework.stereotype.Service;
import ru.zholud.springthymeleaf_homeworke.springthymeleaf.data.Product;
import ru.zholud.springthymeleaf_homeworke.springthymeleaf.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {


        private ProductRepository productRepository;

        public ProductService(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

        public List<Product> getAllProducts() {
            return productRepository.getAllProducts();
        }

        public void deleteById(Long id) {
            productRepository.deleteById(id);
        }


    public void changAmount(Long productId, Integer delta) {
        Product product = productRepository.findById(productId);
        product.setAmount(product.getAmount() + delta);
    }
}

