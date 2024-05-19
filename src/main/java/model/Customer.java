package model;

import model.enums.AccountType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Customer {

    private String name;
    private String surname;
    private String email;
    private String password;
    private Integer credit;
    private String phoneNumber;
    private Set<Address> addresses;
    private Boolean isActive;
    private AccountType accountType;
    private List<Order> orderList = new ArrayList<>();

    /**
     * boş constructor ile customer objesi oluşturulmamalı
     */
    private Customer() {

    }

    public Customer(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.isActive = true;
        this.accountType = AccountType.STANDARD;
    }

    public Customer(String name, String surname, String email, String password, Integer credit,
                    String phoneNumber, Set<Address> addresses, List<Order> orderList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.credit = credit;
        this.phoneNumber = phoneNumber;
        this.addresses = addresses;
        this.orderList = orderList;
        this.isActive = true;
        this.accountType = AccountType.STANDARD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public List<Order> getOrderList() {
        if (orderList ==  null) {
            return new ArrayList<>();
        }
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", credit=" + credit +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                ", accountType=" + accountType +
                '}';
    }
}
