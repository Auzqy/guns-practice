package com.stylefeng.guns.modular.housemanage.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.House;
import com.stylefeng.guns.modular.housemanage.service.IHouseService;

/**
 * 房屋管理控制器
 *
 * @author au
 * @Date 2020-02-10 22:12:33
 */
@Controller
@RequestMapping("/house")
public class HouseController extends BaseController {

    private String PREFIX = "/housemanage/house/";

    @Autowired
    private IHouseService houseService;

    /**
     * 跳转到房屋管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "house.html";
    }

    /**
     * 跳转到添加房屋管理
     */
    @RequestMapping("/house_add")
    public String houseAdd() {
        return PREFIX + "house_add.html";
    }

    /**
     * 跳转到修改房屋管理
     */
    @RequestMapping("/house_update/{houseId}")
    public String houseUpdate(@PathVariable Integer houseId, Model model) {
        House house = houseService.selectById(houseId);
        model.addAttribute("item",house);
        LogObjectHolder.me().set(house);
        return PREFIX + "house_edit.html";
    }

    /**
     * 获取房屋管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return houseService.selectList(null);
    }

    /**
     * 新增房屋管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(House house) {
        houseService.insert(house);
        return SUCCESS_TIP;
    }

    /**
     * 删除房屋管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer houseId) {
        houseService.deleteById(houseId);
        return SUCCESS_TIP;
    }

    /**
     * 修改房屋管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(House house) {
        houseService.updateById(house);
        return SUCCESS_TIP;
    }

    /**
     * 房屋管理详情
     */
    @RequestMapping(value = "/detail/{houseId}")
    @ResponseBody
    public Object detail(@PathVariable("houseId") Integer houseId) {
        return houseService.selectById(houseId);
    }
}
