package com.stylefeng.guns.rest.modular.house.controller;


import com.stylefeng.guns.rest.modular.house.service.IHouseService;
import com.stylefeng.guns.rest.persistence.model.House;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 房屋管理表 前端控制器
 * </p>
 *
 * @author au
 * @since 2020-02-11
 */
@Controller
@RequestMapping("/house")
@Slf4j
public class HouseController {

    @Autowired
    private IHouseService houseService;

    @RequestMapping("/hello")
    public House hello(@RequestBody House house) {
        log.info("house: {}",house);
        return house;
    }
}

