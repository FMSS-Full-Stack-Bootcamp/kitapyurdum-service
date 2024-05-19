package model;

import model.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private LocalDateTime createDate;
    private List<Product> productList;
    private String orderCode; //-ordercode generate
    private OrderStatus orderStatus;

    public Order(List<Product> productList, String orderCode) {
        this.createDate = LocalDateTime.now();
        this.productList = productList;
        this.orderCode = orderCode;
        this.orderStatus = OrderStatus.INITIAL;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "createDate=" + createDate +
                ", productList=" + productList +
                ", orderCode='" + orderCode + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
