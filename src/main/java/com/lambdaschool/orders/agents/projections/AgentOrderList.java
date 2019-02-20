package com.lambdaschool.orders.agents.projections;

import java.util.Set;

public interface AgentOrderList {
  Long getAgentCode();
  String getAgentName();
  Set<OrderList> getOrders();

  interface OrderList {
    long getOrderNum();
    String getOrdDescription();
  }
}
