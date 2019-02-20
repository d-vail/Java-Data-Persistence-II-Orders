package com.lambdaschool.orders.customers.projections;

import com.lambdaschool.orders.orders.Order;

import java.util.Set;

/**
 * An interface-based projection to restrict query results to a list of orders only.
 */
public interface OrderList {
  Set<Order> getOrders();
}
