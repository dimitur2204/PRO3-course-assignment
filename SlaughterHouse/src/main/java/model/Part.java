package model;

import java.util.UUID;

public class Part implements IPart {
	private final UUID id;
	private Double weight;
	private Register register;
	private PartType type;

	public Part() {
		this.id = UUID.randomUUID();
		this.weight = null;
		this.register = null;
		this.type = null;
	}

	@Override
	public UUID getId() {
		return this.id;
	}

	@Override
	public Double getWeight() {
		return weight;
	}

	@Override
	public Register getRegister() {
		return register;
	}

	@Override
	public PartType getType() {
		return type;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public void setType(PartType type) {
		this.type = type;
	}
}
