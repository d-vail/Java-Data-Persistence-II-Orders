package com.lambdaschool.orders.agents;

import com.lambdaschool.orders.agents.projections.AgentCustomerList;
import com.lambdaschool.orders.agents.projections.AgentOrderList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Agent REST Controller
 */
@RestController
@RequestMapping(value = "/agents", produces = MediaType.APPLICATION_JSON_VALUE)
public class AgentController {
  @Autowired
  private AgentRepository agentRepo;

  /**
   * Find all agents with their customers.
   *
   * @return  A list of all agents with their customers
   */
  @GetMapping()
  public List<AgentCustomerList> findAllAgentsCustomerList() {
    return agentRepo.findAllAgentCustomerListBy();
  }

  /**
   * Find all agents with their orders, limited to order number and description.
   *
   * @return  A list of all agents with their orders
   */
  @GetMapping("/orders")
  public List<AgentOrderList> findAllAgentsOrderList() {
    return agentRepo.findAllAgentOrderListBy();
  }
}
