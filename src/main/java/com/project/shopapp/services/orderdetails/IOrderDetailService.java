package com.project.shopapp.services.orderdetails;

import com.project.shopapp.dtos.OrderDetailDTO;
import com.project.shopapp.exceptions.DataNotFoundException;
import com.project.shopapp.models.ProgressDetail;

import java.util.List;

public interface IOrderDetailService {
    ProgressDetail createOrderDetail(OrderDetailDTO newOrderDetail) throws Exception;
    ProgressDetail getOrderDetail(Long id) throws DataNotFoundException;
    ProgressDetail updateOrderDetail(Long id, OrderDetailDTO newOrderDetailData)
            throws DataNotFoundException;
    void deleteById(Long id);
    List<ProgressDetail> findByOrderId(Long orderId);


}
