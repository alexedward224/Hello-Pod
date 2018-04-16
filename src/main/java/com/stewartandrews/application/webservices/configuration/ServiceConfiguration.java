/**
 * 
 */
package com.stewartandrews.application.webservices.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dandrews
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.stewartandrews.application.serviceinterfaces" })
@EnableAutoConfiguration
public class ServiceConfiguration
{
}
