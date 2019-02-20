package com.lambdaschool.orders.agents;

import com.lambdaschool.orders.agents.projections.AgentCustomerList;
import com.lambdaschool.orders.agents.projections.AgentOrderList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * A database interface for the agents table
 */
public interface AgentRepository extends JpaRepository<Agent, Long> {
  List<AgentCustomerList> findAllAgentCustomerListBy();
  List<AgentOrderList> findAllAgentOrderListBy();
}
