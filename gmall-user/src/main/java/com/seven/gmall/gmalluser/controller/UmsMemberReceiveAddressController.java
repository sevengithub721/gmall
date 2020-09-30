package com.seven.gmall.gmalluser.controller;

import com.seven.gmall.gmalluser.entity.po.UmsMemberReceiveAddress;
import com.seven.gmall.gmalluser.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ReceiveAddress")
public class UmsMemberReceiveAddressController {
    @Autowired
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;
    @GetMapping("/getAllReceiveAddress")
    public List<UmsMemberReceiveAddress> getAllReceiveAddress(){
        return umsMemberReceiveAddressService.getAllUmsMemberReceiveAddressService();
    }
}
