package com.southwind.phone_store_demo.impl;

import com.southwind.phone_store_demo.dto.OrderDTO;
import com.southwind.phone_store_demo.service.OrderService;
import com.southwind.phone_store_demo.vo.OrderDetailVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("张三");
        orderDTO.setBuyerPhone("13678787878");
        orderDTO.setBuyerAddress("广东省深圳市罗湖区科技路123号456室");
        orderDTO.setSpecsId(1);
        orderDTO.setPhoneQuantity(1);

        OrderDTO result = orderService.create(orderDTO);
        System.out.println(result);
    }

    @Test
    void findDetail(){
        OrderDetailVO orderDetailVO = orderService.findOrderDetailByOrderId("1591346237169694864");
        int id = 10;
    }

    @Test
    void pay(){
        System.out.println(orderService.pay("1591346237169694864"));
    }
}