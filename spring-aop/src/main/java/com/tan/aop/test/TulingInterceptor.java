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


package com.tan.aop.test;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/12/6 20:42
 */
public class TulingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(@NotNull MethodInvocation methodInvocation) throws Throwable {
        System.out.println(getClass()+"调用前方法");
        Object ret = methodInvocation.proceed();
        System.out.println(getClass()+"调用后处理"+ret);
        return ret;
    }
}
