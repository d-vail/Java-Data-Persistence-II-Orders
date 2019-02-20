package com.lambdaschool.orders.agents;

import com.lambdaschool.orders.customers.Customer;

import javax.persistence.*;
import java.util.Set;

/**
 * AGENT table modeled after the sample database found on W3Resource.
 *
 * @see <a href="https://www.w3resource.com/sql/sql-table.php">W3Resource Sample Database</a>
 */
@Entity
@Table(name = "AGENTS")
public class Agent {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "AGENT_CODE", nullable = false)
  private long agentCode;

  @Column(name = "AGENT_NAME")
  private String agentName;

  @Column(name = "WORKING_AREA")
  private String workingArea;

  @Column(name = "COMMISSION")
  private double commission;

  @Column(name = "PHONE_NO")
  private String phone;

  @Column(name = "COUNTRY")
  private String country;

  @OneToMany()
  private Set<Customer> customers;

  /**
   * Default Constructor
   */
  public Agent() { }

  /**
   * Getter for the agent code.
   *
   * @return  The AGENT_CODE stored in table AGENT
   */
  public long getAgentCode() {
    return agentCode;
  }

  /**
   * Getter for the agent name.
   *
   * @return  The AGENT_NAME stored in table AGENT
   */
  public String getAgentName() {
    return agentName;
  }

  /**
   * Setter for the agent name.
   *
   * @param agentName The name of the agent
   */
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  /**
   * Getter for the agent's working area.
   *
   * @return  The WORKING_AREA stored in the table AGENT
   */
  public String getWorkingArea() {
    return workingArea;
  }

  /**
   * Setter for the agent's working area.
   *
   * @param workingArea The agent's working area
   */
  public void setWorkingArea(String workingArea) {
    this.workingArea = workingArea;
  }

  /**
   * Getter for the agent's commision.
   *
   * @return  The COMMISSION stored in the table AGENT
   */
  public double getCommission() {
    return commission;
  }

  /**
   * Setter for the agent's commission.
   *
   * @param commission  The agent's commission
   */
  public void setCommission(double commission) {
    this.commission = commission;
  }

  /**
   * Getter for the agent's phone number.
   *
   * @return  The PHONE_NO stored in the table AGENT
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Setter for the agent's phone number.
   *
   * @param phone The agent's phone number
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Getter for the agent's country.
   *
   * @return  The COUNTRY stored in the table AGENT
   */
  public String getCountry() {
    return country;
  }

  /**
   * Setter for the agent's country.
   *
   * @param country The agent's country
   */
  public void setCountry(String country) {
    this.country = country;
  }
}
