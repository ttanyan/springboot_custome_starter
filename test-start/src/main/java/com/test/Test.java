/*
 * COPYRIGHT. AnyanT tanlianwang@qq.com
 * ALL RIGHTS RESERVED
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording,
 * or otherwise, without the prior written permission of AnyanT.
 * Amendment History:
 * Amendment History:
 *
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2021/11/28                 anyant           Create the class
 * https://blog.csdn.net/tingfengqianqu
 */


package com.test;

import com.start.tulingxueyuan.UserService;
import com.tan.HelloProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/11/28 23:13
 */
@Component
public class Test {
   @Resource
    UserService userService;
   @Resource
    HelloProperties helloProperties;

    @PostConstruct
    public void test(){
        userService.sayName();
        System.out.println(helloProperties.getName()+helloProperties.getAge());
    }

}
