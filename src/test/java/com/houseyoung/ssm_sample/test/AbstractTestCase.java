package com.houseyoung.ssm_sample.test;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AbstractTestCase
 *
 * @author: zhangteng
 * @time: 2015/3/24 20:03
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring*.xml"})
public abstract class AbstractTestCase extends TestCase {
}
