package com.cts.shopping.cart.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.shopping.cart.response.ValidationResponse;

@FeignClient(name = "Authorization-ms", url = "http://localhost:9090")
public interface AuthClient {
	@GetMapping("/validate")
	public ResponseEntity<ValidationResponse> validatingAuthorizationToken(
			@RequestHeader("Authorization") String tokenDup);
}