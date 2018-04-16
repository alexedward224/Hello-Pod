//
// (C) Copyright 2014-2015 Stewart Andrews Inc.
//
// The information contained herein is confidential and proprietary to
// Stewart Andrews Inc.
//
package com.stewartandrews.application.serviceinterfaces;

import feign.RequestLine;

/**
 * This interface declares the operations that a concrete class must implement.
 * 
 * @author dandrews
 *
 */
public interface HelloService
{
  @RequestLine("GET /hello/sayHello")
  String sayHello();
}

