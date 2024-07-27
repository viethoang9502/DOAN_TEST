package com.project.shopapp.services.product;
import com.project.shopapp.dtos.ProductDTO;
import com.project.shopapp.dtos.ProductImageDTO;
import com.project.shopapp.responses.product.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.project.shopapp.models.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    Lesson createProduct(ProductDTO productDTO) throws Exception;
    Lesson getProductById(long id) throws Exception;
    public Page<ProductResponse> getAllProducts(String keyword,
                                                Long categoryId, PageRequest pageRequest);
    Lesson updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO) throws Exception;

    List<Lesson> findProductsByIds(List<Long> productIds);
    String storeFile(MultipartFile file) throws IOException;
    void deleteFile(String filename) throws IOException;

    Lesson likeProduct(Long userId, Long productId) throws Exception;
    Lesson unlikeProduct(Long userId, Long productId) throws Exception;
    List<ProductResponse> findFavoriteProductsByUserId(Long userId) throws Exception;
}
