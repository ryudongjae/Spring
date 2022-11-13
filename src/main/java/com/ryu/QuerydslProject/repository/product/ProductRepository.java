package com.ryu.QuerydslProject.repository.product;

import com.ryu.QuerydslProject.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
