package com.demo.api3;


import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;


public class CopyOfPactTest {
	


	@Rule
	public PactProviderRuleMk2 mockProvider
	  = new PactProviderRuleMk2("test_provider","localhost", 9090,  this);


	    @Pact( provider="test_provider",consumer="test_consumer1")
	    public RequestResponsePact createPact1(PactDslWithProvider builder) {
	    	Map<String, String> headers = new HashMap<>();
	        headers.put("Content-Type", "application/json");
	       
	    	
	    		
	    			
	    	
	    	
	    	
	    	
	    	return builder
	                .given("test state")
	                .uponReceiving("test")
	                .path("/ldap/getEmployeeV1")
	                .method("GET")
	                .willRespondWith()
	                .status(200)
	              
	                .toPact();
	    }
	  
	    @Test
	    @PactVerification(value="test_provider")
	  public  void test() throws Exception {
	    	
	    	 Map expectedResponse = new HashMap();
	    	 ResponseEntity<String> response = new RestTemplate().getForEntity(mockProvider.getUrl() + "/ldap/getEmployeeV1", String.class);
	    	  System.out.println("test"+ response.getStatusCode().value());
	    	 
	        //HttpResponse httpResponse = Request.Get(mockServer.getUrl() + "/").execute().returnResponse();
	       // assertThat(httpResponse.getStatusLine().getStatusCode(), is(equalTo(200)));
	    }
	}