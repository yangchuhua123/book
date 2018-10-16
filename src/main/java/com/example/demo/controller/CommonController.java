package com.example.demo.controller;

import com.example.demo.DTO.OrderDTO;
import com.example.demo.convert.OrderCreateConvert;
import com.example.demo.eception.BookException;
import com.example.demo.enums.ResultEnums;
import com.example.demo.form.OrderForm;
import com.example.demo.pojo.Buyer;
import com.example.demo.pojo.Seller;
import com.example.demo.service.BuyerService;
import com.example.demo.service.OrderService;
import com.example.demo.service.SellerService;
import com.sun.tools.internal.ws.wsdl.document.BindingFault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/common")
public class CommonController {
    @Autowired
    private BuyerService buyerService;

    @Autowired
    private SellerService sellerService;

    @Autowired
    private OrderService orderService;

    /*用户登录*/
    @GetMapping("/selectByPhoneAndPassword")
    public Map<String,Object> selectByPhoneAndPassword(String identity,String phone, String password){
        Map<String,Object> map = new HashMap<>();
        if (identity.equals("buyer")){
            Buyer buyer = buyerService.selectByPhoneAndPassword(phone,password);
            if(buyer == null){
                map.put("message", ResultEnums.SELECT_FAILURE.getMessage());

            }else{
                map.put("message",ResultEnums.SELECT_SUCCESS.getMessage());
                map.put("people",buyer);
            }
        }else if(identity.equals("seller")){
            Seller seller = sellerService.selectByPhoneAndPassword(phone,password);
            if(seller == null){
                map.put("message", ResultEnums.SELECT_FAILURE.getMessage());

            }else{
                map.put("message",ResultEnums.SELECT_SUCCESS.getMessage());
                map.put("people",seller);
            }
        }

        return map;
    }


    /*创建订单,
    *前端传来name,phone,address,items
    *需要进行转换
    * */

    @GetMapping("/order/create")
    public Map<String ,Object> createOrder(@Valid OrderForm orderForm, BindingResult bindingResult){
        Map<String,Object> map = new HashMap<>();
        if(bindingResult.hasErrors()){
            throw new BookException(ResultEnums.PARAM_ERROR);
        }
        OrderDTO orderDTO = OrderCreateConvert.convert(orderForm);
        /*
        * 调用service创建订单
        * */
        return map;
    }

    /*订单列表的展示
    * 创建一个orderDTO，用来连接订单表和订单详情表
    * */
    @GetMapping("/order/List")
    public Map<String,Object> orderList(@RequestParam("phone") String phone){
        Map<String,Object> map = new HashMap<>();
        return map;
    }

}
