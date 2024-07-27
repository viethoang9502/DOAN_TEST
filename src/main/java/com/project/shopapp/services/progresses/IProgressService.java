package com.project.shopapp.services.progresses;

import com.project.shopapp.dtos.OrderDTO;
import com.project.shopapp.exceptions.DataNotFoundException;
import com.project.shopapp.models.Progress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProgressService {
    Progress createOrder(OrderDTO orderDTO) throws Exception;
    Progress getOrder(Long id);
    Progress updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Progress> findByUserId(Long userId);
    Page<Progress> getOrdersByKeyword(String keyword, Pageable pageable);
}
