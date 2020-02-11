package com.stylefeng.guns.rest.modular.house.service.impl;

import com.stylefeng.guns.rest.persistence.model.House;
import com.stylefeng.guns.rest.persistence.dao.HouseMapper;
import com.stylefeng.guns.rest.modular.house.service.IHouseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 房屋管理表 服务实现类
 * </p>
 *
 * @author au
 * @since 2020-02-11
 */
@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements IHouseService {

}
