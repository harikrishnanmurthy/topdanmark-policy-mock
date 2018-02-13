package com.topdanmark.ms.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.topdanmark.ms.policy.entity.Policy;
import com.topdanmark.ms.policy.service.PolicyMockService;


@RestController
@RequestMapping("/ms/policy")
public class PolicyController {

	@Autowired
	PolicyMockService policyMockService;

	@RequestMapping(value = "/details/{policyId}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Policy fetchPolicyDetails(@PathVariable("policyId") String policyId) {
		System.out.println("policyId: " + policyId);
		Policy policyDetails = policyMockService.fetchPolicyDetails(policyId);
		return policyDetails;
	}

}
