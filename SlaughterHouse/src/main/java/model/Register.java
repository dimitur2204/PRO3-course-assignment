package model;

import java.util.UUID;

public class Register implements IRegister {
	private final UUID id;
	private Double weight;

	public Register() {
		this.id = UUID.randomUUID();
		this.weight = null;
	}

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public Double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
