package com.test;/*
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
 * 2021/11/24                 anyant           Create the class
 * https://blog.csdn.net/tingfengqianqu
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/11/24 00:39
 */
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestApplication.class);
        SpringApplication.run(TestApplication.class, args);
        logger.info("===============My ByName 启动成功==============");
    }

}
