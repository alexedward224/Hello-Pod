//
// (C) Copyright 2014-2015 Stewart Andrews Inc.
//
// The information contained herein is confidential and proprietary to
// Stewart Andrews Inc.
//
package com.stewartandrews.application.serviceinterfaces.services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stewartandrews.AbstractBaseTest;
import com.stewartandrews.application.serviceinterfaces.HelloService;
import com.stewartandrews.application.webservices.HelloServiceApplication;

/**
 * @author dandrews
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloServiceApplication.class)
public class HelloServiceDefaultTest extends AbstractBaseTest
{
  @Autowired
  private HelloService service;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception
  {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception
  {
  }

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception
  {
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception
  {
  }

  @Test
  public void testHello()
  {
    String expected = "Hello";
    Assert.assertEquals(expected, this.service.sayHello());
  }

}
