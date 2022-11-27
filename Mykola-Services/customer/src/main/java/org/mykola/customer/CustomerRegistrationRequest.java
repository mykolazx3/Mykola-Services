package org.mykola.customer;

public record CustomerRegistrationRequest(
		String firstName,
		String lastName,
		String email) {
}
