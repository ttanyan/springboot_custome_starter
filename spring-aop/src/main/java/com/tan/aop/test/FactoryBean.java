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

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/12/6 20:47
 */
@Configuration
public class FactoryBean {
    @Bean
    public Calculate tulingCalculate(){
        return new CalculateImpl();
    }
    @Bean
    public TulingLogAdvice tulingLogAdvice(){
        return new TulingLogAdvice();
    }
    @Bean
    public TulingInterceptor tulingInterceptor(){
        return new TulingInterceptor();
    }

//    @Bean
//    public NameMatchMethodPointcutAdvisor tulingLogAspect(){
//        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
//        advisor.setAdvice(tulingLogAdvice());
//        advisor.setAdvice(tulingInterceptor());
//        advisor.setMappedNames("add");
//        return advisor;
//    }

//    @Bean
//    public ProxyFactoryBean calculateProxy(){
//        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//        proxyFactoryBean.setInterceptorNames("tulingLogAdvice","tulingInterceptor");
//        proxyFactoryBean.setInterceptorNames("tulingLogAspect");
//        proxyFactoryBean.setTarget(tulingCalculate());
//        return proxyFactoryBean;
//    }

//    @Bean
//    public BeanNameAutoProxyCreator autoProxyCreator(){
//        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//        //设置要创建代理的哪些bean名字
//        beanNameAutoProxyCreator.setBeanNames("tuling*");
//        //设置拦截器的名字
//        beanNameAutoProxyCreator.setInterceptorNames("tulingInterceptor");
//        return beanNameAutoProxyCreator;
//    }
    @Bean
    public RegexpMethodPointcutAdvisor tulingLogAspectInterceptor(){
        RegexpMethodPointcutAdvisor advisor = new RegexpMethodPointcutAdvisor();
        advisor.setAdvice(tulingInterceptor());
        advisor.setPattern("com.tan.aop.test.*");
        return advisor;
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        return new DefaultAdvisorAutoProxyCreator();
    }

}
