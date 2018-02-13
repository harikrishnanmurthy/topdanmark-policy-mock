package com.topdanmark.ms.policy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.topdanmark.ms.policy.service.PolicyMockService;
import com.topdanmark.ms.policy.entity.Policy;

@Service
public class PolicyMockServiceImpl implements PolicyMockService {

	@Override
	public Policy fetchPolicyDetails(String policyId) {
		
		//preparing mock policy list
		Policy policy1 = new Policy("123123123", "car insurance", "2017-01-01", "5000", "USD");
		Policy policy2 = new Policy("456456456", "bike insurance", "2017-02-02", "2000", "USD");
		Policy policy3 = new Policy("789789789", "health insurance", "2017-03-03", "3000", "USD");
		Policy policy4 = new Policy("123456789", "life insurance", "2017-04-01", "10000", "USD");
		List<Policy> policyList = new ArrayList<>();
		policyList.add(policy1);
		policyList.add(policy2);
		policyList.add(policy3);
		policyList.add(policy4);
		
		//return 
		Policy policyDetails = policyList.stream().filter(p -> p.getPolicy().equals(policyId)).findFirst().get();
		return policyDetails;
	}

}
