package com.ryu.QuerydslProject.service.product;

import com.ryu.QuerydslProject.domain.product.Product;
import com.ryu.QuerydslProject.dto.product.ProductDTO;
import com.ryu.QuerydslProject.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public Product saveProduct(ProductDTO.SaveRequest saveRequest){
        return null;
    }

    public void deleteProduct(long productId){

    }

    public void updateProduct(long productId , ProductDTO.UpdateRequest updateRequest){

    }
}
