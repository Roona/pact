/*package com.demo.api3;


import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;


public class PactTest {
	

	@Rule
	public PactProviderRuleMk2 mockProvider
	  = new PactProviderRuleMk2("test_provider","localhost", 9090,  this);


	    @Pact( provider="test_provider",consumer="test_consumer1")
	    public RequestResponsePact createPact1(PactDslWithProvider builder) {
	    	Map<String, String> headers = new HashMap<>();
	        headers.put("Content-Type", "application/json");
	        DslPart etaResults = new PactDslJsonBody().stringType("name","roona").integerType("eta",4).asBody();
	       
	    	
	    	
	    	PactDslJsonBody body = new PactDslJsonBody();
	    	
	    	body
	    	.stringType("serial_number","suri")
	    	.stringType("location","FGOSS-00000090-FDX GRD/OSS PITTSBURGH")
	    	.stringType("meter_Number","987654")
	    	.stringType("company","")
	    	.stringType("comments","Created1")
	    	.stringType("assigned_To","Yvette Murray")
	    	.stringType("owned_By","Michael Anthony Andrejco")
	    	.stringType("asset_Tag","5CG7200L8Z")
	    	.stringType("ci_Name","")
	    	.stringType("model","HP EliteBook 840 G3")
	    	.stringType("display_name","5CG7200L8Z - HP EliteBook 840 G3")
	    	.stringType("fedex_Part_Number","")
	    	.stringType("hardware_Support_Group","") 			
	    	.closeObject();		
	    	body.object("serial_inquiry")
	    	.stringType("location","CANEQ-00000000-ASSET MANAGEMENT LOC")
	    	.stringType("meter_Number","")
	    	.stringType("company","")
	    	.stringType("comments","Created1")
	    	.stringType("serial_number","1N1G9Z2")
	    	.stringType("assigned_To","")
	    	.stringType("owned_By","")
	    	.stringType("asset_Tag","1N1G9Z2")
	    	.stringType("ci_Name","HP EliteBook x360 1030 G2")
	    	.stringType("model","HP EliteBook 840 G3")
	    	.stringType("display_name","5CG7200L8Z - HP EliteBook 840 G3")
	    	.stringType("fedex_Part_Number","")
	    	.stringType("hardware_Support_Group","") 			
	    	.closeObject();				
	    			
	    	
	    	
	    	
	    	
	    	return builder
	                .given("test state")
	                .uponReceiving("test")
	                .path("/api/hclfe/asset_inquiry")
	                .method("GET")
	                .willRespondWith()
	                .status(200)
	               .body(body)
	                .toPact();
	    }
	  
	    @Test
	    @PactVerification(value="test_provider")
	  public  void test() throws Exception {
	    	
	    	 Map expectedResponse = new HashMap();
	    	 ResponseEntity<String> response = new RestTemplate().getForEntity(mockProvider.getUrl() + "/api/hclfe/asset_inquiry", String.class);
	    	  System.out.println("test"+ response.getStatusCode().value());
	    	 
	        //HttpResponse httpResponse = Request.Get(mockServer.getUrl() + "/").execute().returnResponse();
	       // assertThat(httpResponse.getStatusLine().getStatusCode(), is(equalTo(200)));
	    }
	}


*/