package com.seven.gmall.gmalluser.service.impl;

import com.seven.gmall.gmalluser.entity.po.UmsMemberReceiveAddress;
import com.seven.gmall.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import com.seven.gmall.gmalluser.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMemberReceiveAddress> getAllUmsMemberReceiveAddressService() {
        return umsMemberReceiveAddressMapper.selectAll();
    }
}
