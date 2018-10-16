package com.example.demo.convert;

import com.example.demo.form.RegisterForm;
import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;
import com.example.demo.utils.CharacterUtils;

public class RegisterFormConvertSeller {
    public static Seller convertRegisterForm(RegisterForm registerForm){
        Seller seller = new Seller();
        String sellerName = "";
        String sellerWechat = "";
        if(registerForm.getName()==null ||registerForm.getName().equals("")){
            sellerName = CharacterUtils.getRandomString(10);
        }else{
            sellerName = registerForm.getName();
        }
        if (registerForm.getWechat() == null ||registerForm.getWechat() .equals("")){
            sellerWechat = registerForm.getPhone();
        }else{
            sellerWechat = registerForm.getWechat();
        }
        seller.setSellerPhone(registerForm.getPhone());
        seller.setSellerPassword(registerForm.getPassword());
        seller.setSellerName(sellerName);
        seller.setSellerIdentity(registerForm.getIdentity());
        seller.setWechat(sellerWechat);
        return seller;
    }
}
