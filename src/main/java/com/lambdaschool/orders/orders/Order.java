package com.lambdaschool.orders.orders;

import javax.persistence.*;

/**
 * ORDERS table modeled after the sample database found on W3Resource.
 *
 * @see <a href="https://www.w3resource.com/sql/sql-table.php">W3Resource Sample Database</a>
 */
@Entity
@Table(name = "ORDERS")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ORD_NUM", nullable = false)
  private long orderNum;

  @Column(name = "ORD_AMOUNT", nullable = false)
  private double ordAmount;

  @Column(name = "ADVANCE_AMOUNT", nullable = false)
  private double advanceAmount;

  @ManyToOne
  @JoinColumn(name = "CUST_CODE", nullable = false)
  private long custCode;

  @ManyToOne
  @JoinColumn(name = "AGENT_CODE", nullable = false)
  private long agentCode;

  @Column(name = "ORD_DESCRIPTION", nullable = false)
  private String ordDescription;

  /**
   * Default Constructor
   */
  public Order() { }

  /**
   * Getter for the order number.
   *
   * @return  The ORD_NUM stored in table ORDERS
   */
  public long getOrderNum() {
    return orderNum;
  }

  /**
   * Getter for the order amount.
   *
   * @return  The ORD_AMOUNT stored in table ORDERS
   */
  public double getOrdAmount() {
    return ordAmount;
  }

  /**
   * Setter for the order amount.
   *
   * @param ordAmount The order amount
   */
  public void setOrdAmount(double ordAmount) {
    this.ordAmount = ordAmount;
  }

  /**
   * Getter for the order's advance amount.
   *
   * @return  The ADVANCE_AMOUNT stored in table ORDERS
   */
  public double getAdvanceAmount() {
    return advanceAmount;
  }

  /**
   * Setter for the order's advance amount.
   *
   * @param advanceAmount The advance amount
   */
  public void setAdvanceAmount(double advanceAmount) {
    this.advanceAmount = advanceAmount;
  }

  /**
   * Getter for the customer code of the customer associated with this order.
   *
   * @return  The CUST_CODE stored in table ORDERS
   */
  public long getCustCode() {
    return custCode;
  }

  /**
   * Setter for the customer code belonging to this order.
   *
   * @param custCode  The customer code of the customer associated with this order
   */
  public void setCustCode(long custCode) {
    this.custCode = custCode;
  }

  /**
   * Getter for the agent code of the agent associated with this order.
   *
   * @return  The AGENT_CODE stored in table ORDERS
   */
  public long getAgentCode() {
    return agentCode;
  }

  /**
   * Setter for the agent code belonging to this order
   *
   * @param agentCode The agent code for the agent associated with this order
   */
  public void setAgentCode(long agentCode) {
    this.agentCode = agentCode;
  }

  /**
   * Getter for the order description.
   *
   * @return  The ORD_DESCRIPTION stored in table ORDERS
   */
  public String getOrdDescription() {
    return ordDescription;
  }

  /**
   * Setter for the order description.
   *
   * @param ordDescription  The order description
   */
  public void setOrdDescription(String ordDescription) {
    this.ordDescription = ordDescription;
  }
}
