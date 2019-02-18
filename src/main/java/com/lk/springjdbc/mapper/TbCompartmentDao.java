package com.lk.springjdbc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.lk.springjdbc.pojo.TbCompartment;

/**
 * @author lk
 * @date 2019-02-18 19:00
 */
@Mapper
public interface TbCompartmentDao {

    List<TbCompartment> getAll();
}
