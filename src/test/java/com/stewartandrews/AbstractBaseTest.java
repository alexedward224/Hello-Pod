//
// (C) Copyright 2014-2015 Stewart Andrews Inc.
//
// The information contained herein is confidential and proprietary to
// Stewart Andrews Inc.
//
package com.stewartandrews;

import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author dandrews
 *
 */
public abstract class AbstractBaseTest
{
  protected final Logger logger = LogManager.getLogger(AbstractBaseTest.class);

  // reusable helper method
  protected static Object lazy(final Supplier<String> s)
  {
    return new Object()
    {
      @Override
      public String toString()
      {
        return s.get();
      }
    };
  }

  protected static String compute(final String value)
  {
    System.out.println("very long computation");
    System.out.println(value);
    return "";
  }
}
