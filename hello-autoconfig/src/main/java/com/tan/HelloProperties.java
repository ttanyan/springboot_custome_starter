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
 * 2021/11/29                 anyant           Create the class
 * https://blog.csdn.net/tingfengqianqu
 */


package com.tan;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/11/29 00:53
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
