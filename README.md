# Java Backend Data Persistence with SQL, Hibernate - Inserting and Modifying Data

## Orders Project

### Introduction

This is a basic database scheme with customers, orders, and sales agents.

### Instructions

Create a REST api server to store and read data from an in memory H2 database. The database is adapted from the sample 
database found at [https://www.w3resource.com/sql/sql-table.php](https://www.w3resource.com/sql/sql-table.php).

#### Create the entities needed to store the data

The table layouts are as follows

- AGENTS
  - AGENTCODE primary key, not null Long
  - AGENTNAME string
  - WORKINGAREA string
  - COMMISSION double
  - PHONE string
  - COUNTRY string
- CUSTOMER
  - CUSTCODE primary key, not null Long
  - CUSTNAME String, not null
  - CUSTCITY String
  - WORKINGAREA String
  - CUSTCOUNTRY String
  - GRADE String
  - OPENINGAMT double
  - RECEIVEAMT double
  - PAYMENTAMT double
  - OUTSTANDINGAMT double
  - PHONE String
  - AGENTCODE Long foreign key (one agent to many customers) not null
- ORDERS
  - ORDNUM primary key, not null Long
  - ORDAMOUNT double
  - ADVANCEAMOUNT double
  - CUSTCODE Long foreign key (one customer to many orders) not null
  - AGENTCODE Long foreign key (one agent to many orders) not null
  - ORDDESCRIPTION

#### Seed the database

Load in the data using a pre-populated `data.sql` file.

#### Create generic error pages

Override the whitelabel error page with generic html error pages.

- Create a generic error html page to return when error 404 happens
- Create a different generic error html page to return when error 500 happens
- Create a different generic error html page to return when an error other than a 404 or 500 happens

#### Expose the following endpoints

| Method    | Endpoint                      | Action |                                                            
| --------- | ----------------------------- | ------ |
| GET       | /customer/order               | Returns all customers with their orders   |
| GET       | /customer/name/{custname}     | Returns all orders for a particular based on name |
| GET       | /customer/order/{custcode}    | Returns all orders for a particular customer based on custcode    |
| GET       | /agents                       | Returns all agents with their customers   |
| GET       | /agents/orders                | Return a list with the agents name and associated order number and order description  |
| DELETE    | /customer/{custcode}          | Deletes a customer based off of their custcode and deletes all their associated orders    |

### Stretch Goals

| Method    | Endpoint               | Action                                                            |
| --------- | ---------------------- | ----------------------------------------------------------------- |
| DELETE    | /agents/{agentcode}    | Deletes an agent if they are not assigned to a customer or order  |
