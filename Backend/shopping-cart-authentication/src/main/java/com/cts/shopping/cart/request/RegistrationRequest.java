package com.cts.shopping.cart.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class RegistrationRequest {
	@NotBlank(message = "UserName shouldn't be blank")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE, message = "Invalid Username")
	private String username;

	@NotBlank(message = "Name shouldn't be blank")
	private String name;

	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,20}$", message = "Password length should be between 8 and 20 characters, "
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RegistrationRequest(
			@NotBlank(message = "UserName shouldn't be blank") @Email(message = "Invalid Username") String username,
			@NotBlank(message = "Name shouldn't be blank") String name,
			@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,20}$", message = "Password length should be between 8 and 20 characters, with at least one lowercase, uppercase, number, and special character.") String password) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
	}

}
