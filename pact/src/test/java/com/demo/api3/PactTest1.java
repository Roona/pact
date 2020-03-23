package com.demo.api3;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;

@RunWith(SpringRestPactRunner.class)
@Provider("test_provider")
@PactFolder("target/pacts")
@SpringBootTest(classes=API3AppApplication.class,properties={"spring.profiles.active=test","spring.cloud.config.enabled=false"},webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

public class PactTest1 {
	
	@TestTarget
	public final Target target = new HttpTarget("http", "localhost", 8870, "/api/hello");
	@State(value="test state")
	public void toGetState() {
		System.out.println("test"); }
}
