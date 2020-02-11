package com.stylefeng.guns.jwt;

import com.alibaba.fastjson.JSON;
import com.stylefeng.guns.core.util.MD5Util;
import com.stylefeng.guns.rest.common.SimpleObject;
import com.stylefeng.guns.rest.modular.auth.converter.BaseTransferEntity;
import com.stylefeng.guns.rest.modular.auth.security.impl.Base64SecurityAction;
import com.stylefeng.guns.rest.persistence.model.House;

/**
 * jwt测试
 *
 * @author fengshuonan
 * @date 2017-08-21 16:34
 */
public class DecryptTest {

    public static void main(String[] args) {

//        String salt = "0iqwhi";

//        SimpleObject simpleObject = new SimpleObject();
//        simpleObject.setUser("stylefeng");
//        simpleObject.setAge(12);
//        simpleObject.setName("ffff");
//        simpleObject.setTips("code");
//
//        String jsonString = JSON.toJSONString(simpleObject);

        // 填写 randomKey 的值
        String salt = "ag24ze";

        House house = new House();
        house.setId(1);

        String jsonString = JSON.toJSONString(house);

        String encode = new Base64SecurityAction().doAction(jsonString);
        String md5 = MD5Util.encrypt(encode + salt);

        BaseTransferEntity baseTransferEntity = new BaseTransferEntity();
        baseTransferEntity.setObject(encode);
        baseTransferEntity.setSign(md5);

        System.out.println(JSON.toJSONString(baseTransferEntity));
    }
}
