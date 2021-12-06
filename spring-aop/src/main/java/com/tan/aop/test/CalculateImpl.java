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

/**
 * @author anyant
 * @version 1.0
 * @Description
 * @Date 2021/12/6 20:37
 */
public class CalculateImpl implements Calculate{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
