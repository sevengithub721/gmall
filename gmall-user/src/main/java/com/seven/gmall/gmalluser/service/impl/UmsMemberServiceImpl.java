package com.seven.gmall.gmalluser.service.impl;

import com.seven.gmall.gmalluser.entity.po.UmsMember;
import com.seven.gmall.gmalluser.mapper.UmsMemberMapper;
import com.seven.gmall.gmalluser.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUmsMemberService() {
        return umsMemberMapper.selectAll();
    }
}
