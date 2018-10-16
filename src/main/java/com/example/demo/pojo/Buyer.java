package com.example.demo.pojo;

import lombok.Data;

@Data
public class Buyer {
    private Integer buyerId;
    private String  buyerPhone;
    private String  buyerPassword;
    private String  buyerName;
    private String  buyerIdentity;
    private String wechat;

    @Override
    public String toString() {
        return "Buyer{" +
                "buyerId=" + buyerId +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", buyerPassword='" + buyerPassword + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerIdentity='" + buyerIdentity + '\'' +
                ", wechat='" + wechat + '\'' +
                '}';
    }
}
