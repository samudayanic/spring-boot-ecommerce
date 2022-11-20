package com.withsam.ecommerce.dto;

import com.withsam.ecommerce.entity.Address;
import com.withsam.ecommerce.entity.Customer;
import com.withsam.ecommerce.entity.Order;
import com.withsam.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
