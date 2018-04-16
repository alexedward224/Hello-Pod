//
// (C) Copyright 2014-2015 Stewart Andrews Inc.
//
// The information contained herein is confidential and proprietary to
// Stewart Andrews Inc.
//
package com.stewartandrews.application.serviceinterfaces.services;

import org.springframework.stereotype.Component;

import com.stewartandrews.application.serviceinterfaces.HelloService;

/**
 * An implementation of the hello interface.
 *
 * @author dandrews
 *
 */
@Component
public final class HelloDefaultService implements HelloService
{
  public String sayHello()
  {
    return "Hello";
  }
}
