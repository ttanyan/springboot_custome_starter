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
 * 2021/12/6                 anyant           Create the class
 * https://blog.csdn.net/tingfengqianqu
 */


package com.tan.aop;

import com.tan.aop.test.Calculate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/12/6 20:52
 */
@ComponentScan(basePackages = "com.tan.aop.test")
public class BootStrapApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BootStrapApplication.class);
//        Calculate calculateProxy = context.getBean("calculateProxy", Calculate.class);
        Calculate tulingCalculate = context.getBean("tulingCalculate", Calculate.class);
        tulingCalculate.add(1,1);
//        tulingCalculate.sub(1,2);
    }
}
