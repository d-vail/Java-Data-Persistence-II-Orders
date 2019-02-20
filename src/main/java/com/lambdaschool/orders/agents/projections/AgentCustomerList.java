package com.lambdaschool.orders.agents.projections;

import java.util.Set;

public interface AgentCustomerList {
  Long getAgentCode();
  String getAgentName();
  String getWorkingArea();
  double getCommission();
  String getPhone();
  Set<CustomerList> getCustomers();

  interface CustomerList {
    long getCustCode();
    String getCustName();
    String getPhone();
  }
}
