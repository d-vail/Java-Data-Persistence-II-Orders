package com.lambdaschool.orders.customers.projections;

import com.lambdaschool.orders.orders.Order;

import java.util.Set;

public interface OrderList {
  Set<Order> getOrders();
}
