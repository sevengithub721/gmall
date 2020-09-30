package com.seven.gmall.gmalluser.controller;

import com.seven.gmall.gmalluser.entity.po.UmsMember;
import com.seven.gmall.gmalluser.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class UmsMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @GetMapping("/getUmsMemberList")
    public List<UmsMember> getUmsMemberList(){
        return umsMemberService.getAllUmsMemberService();
    }

}
