package com.lk.springjdbc.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.lk.springjdbc.pojo.TbCompartment;
import com.lk.springjdbc.mapper.TbCompartmentDao;

import javax.annotation.Resource;

/**
 * @author lk
 * @date 2019-02-18 19:00
 */
@Service
public class TbCompartmentService {

    @Resource
    private TbCompartmentDao tbCompartmentDao;

    public List<TbCompartment> getAll() {
        return tbCompartmentDao.getAll();
    }

}
