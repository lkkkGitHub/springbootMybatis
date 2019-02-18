package com.lk.springjdbc.controller;

import com.lk.springjdbc.pojo.TbCompartment;
import com.lk.springjdbc.service.TbCompartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author leike
 * @date 2019/2/18 18:58
 */
@Controller
@RequestMapping("/compartment")
public class CompartmentController {

    @Autowired
    private TbCompartmentService service;

    @ResponseBody
    @GetMapping("/getAll")
    public List<TbCompartment> getAllCompartment() {
        return service.getAll();
    }
}
