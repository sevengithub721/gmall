package com.seven.gmall.gmalluser.service;

import com.seven.gmall.gmalluser.entity.po.UmsMember;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑层接口
 */
public interface UmsMemberService {
     //获取所有umsmember记录
    List<UmsMember> getAllUmsMemberService();

}
