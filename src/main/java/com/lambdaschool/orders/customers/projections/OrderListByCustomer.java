package com.lambdaschool.orders.customers.projections;

import com.lambdaschool.orders.orders.Order;

import java.util.Set;

/**
 * An interface-based projection to restrict query results to a customer's code, name, and
 * associated orders.
 */
public interface OrderListByCustomer {
  Long getCustCode();
  String getCustName();
  Set<Order> getOrders();
}
