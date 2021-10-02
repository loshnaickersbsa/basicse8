package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {

    private final Product product;
    private final Integer orderQuantity;
    private Double ordAmount;
    private MyDate orderDate;
    private String customer;

    public Product getProduct() {
        return product;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public Double getOrdAmount() {
        return ordAmount;
    }

    public void setOrdAmount(Double ordAmount) {
        this.ordAmount = ordAmount;
    }

    private JobSize jobSize() throws Exception {

        if (orderQuantity >= 1 && orderQuantity <= 25) {
            return JobSize.S;
        } else if (orderQuantity >= 26 && orderQuantity <= 75) {
            return JobSize.M;
        } else if (orderQuantity >= 76 && orderQuantity <= 150) {
            return JobSize.L;
        } else if (orderQuantity > 150) {
            return JobSize.X;
        }

        throw new Exception("Invalid Order Quantity");

    }

    public Order(Product product, Integer orderQuatity, Double ordAmount, MyDate orderDate, String customer) {
        this.product = product;
        this.orderQuantity = orderQuatity;
        this.ordAmount = ordAmount;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public double computeTotal() {
        //
        double tax = 1500;

        JobSize calcualtedJobSize;
        try {
            calcualtedJobSize = jobSize();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("invalid input for OrderQuantity " + this.orderQuantity);
            return 0;
        }
        System.out.println("job size" + calcualtedJobSize);

        double discount = 0;

        switch (calcualtedJobSize) {
            case S:
                discount = 0;
                break;
            case M:
                discount = 1;
                break;
            case L:
                discount = 2;
                break;
            case X:
                discount = 3;
                break;
        }
        discount = ordAmount * ( discount / 100 );

        if (this.ordAmount <= 0) {
            System.out.println("invalid input for Amount " + this.orderQuantity);
            return 0;
        }

        if (ordAmount > 1500) {
             tax = 0;
        }
        else tax = 0.2 * ordAmount;

        System.out.println("(ordAmount - discount + tax)" + ordAmount +"-"+ discount +"+" + tax);
        return (ordAmount - discount + tax);

    }

    public MyDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(MyDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", orderQuatity=" + orderQuantity +
                ", ordAmount=" + ordAmount +
                ", orderDate=" + orderDate +
                ", customer='" + customer + '\'' +
                '}';
    }
}


