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

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/11/29 00:57
 */
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnProperty("spring.port")
public class HelloAutoConfig {
}
