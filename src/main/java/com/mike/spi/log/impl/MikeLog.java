package com.mike.spi.log.impl;

import com.mike.spi.log.Log;

/**
 * @Author: MikeWang
 * @Date: 2019/12/19 4:29 PM
 * @Description:
 */
public class MikeLog implements Log{
    @Override
    public void sayHello() {
        System.out.println("mike log");
    }
}
