package com.example.demo.convert;

import com.example.demo.form.RegisterForm;
import com.example.demo.pojo.Buyer;
import com.example.demo.utils.CharacterUtils;

public class RegisterFormConvertBuyer {

    public static Buyer convertRegisterForm(RegisterForm registerForm){
        Buyer buyer = new Buyer();
        String buyerName = "";
        String buyerWechat = "";
        if(registerForm.getName()==null ||registerForm.getName().equals("")){
            buyerName = CharacterUtils.getRandomString(10);
        }else{
            buyerName = registerForm.getName();
        }
        if (registerForm.getWechat() == null ||registerForm.getWechat() .equals("")){
            buyerWechat = registerForm.getPhone();
        }else{
            buyerWechat = registerForm.getWechat();
        }
        buyer.setBuyerPhone(registerForm.getPhone());
        buyer.setBuyerPassword(registerForm.getPassword());
        buyer.setBuyerName(buyerName);
        buyer.setBuyerIdentity(registerForm.getIdentity());
        buyer.setWechat(buyerWechat);
        return buyer;
    }
}
