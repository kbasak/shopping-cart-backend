package com.cts.shopping.cart.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class LoginRequest {
	@NotBlank(message = "UserName shouldn't be blank")
	@Email(message = "Invalid Username")
	private String username;

	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,20}$", 
			message = "Password length should be between 8 and 20 characters, "
					+ "with at least one lowercase, uppercase, number, and special character.")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequest(@NotNull(message = "UserName shouldn't be null") String username,
			@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,20}$", message = "Use Atleast one Small, Caps and Number and minimum Length should be 8") String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
