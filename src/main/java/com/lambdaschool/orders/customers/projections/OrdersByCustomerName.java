package com.lambdaschool.orders.customers.projections;

import com.lambdaschool.orders.orders.Order;

import java.util.Set;

public interface OrdersByCustomerName {
  Long getCustCode();
  String getCustName();
  Set<Order> getOrders();
}
