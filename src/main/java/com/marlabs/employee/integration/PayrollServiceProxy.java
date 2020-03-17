package com.marlabs.employee.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient (name = "payroll-service", url="${CURRENCY_EXCHANGE_URI:http://localhost:8000}")
@FeignClient (name = "payroll-service", configuration = FeignClientConfig.class)
public interface PayrollServiceProxy {

	@GetMapping("/payrollservice/salary/{empId}")
	public Double getSalary(@PathVariable Integer empId);
}
