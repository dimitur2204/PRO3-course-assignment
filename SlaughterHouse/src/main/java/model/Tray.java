package model;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Tray implements ITray {
	private final UUID id;
	private PartType type;
	private List<IPart> parts;
	private Double maxWeight;
	private Integer maxCapacity;

	public Tray() {
		this.id = UUID.randomUUID();
		this.parts = Collections.unmodifiableList(parts);
		this.type = null;
		this.maxWeight = null;
		this.maxCapacity = null;
	}

	@Override
	public UUID getId() {
		return this.id;
	}

	@Override
	public PartType getType() {
		return this.type;
	}

	@Override
	public void setType(PartType type) {
		this.type = type;
	}

	@Override
	public List<IPart> getParts() {
		return List.of();
	}

	@Override
	public void setParts(List<IPart> parts) {
		this.parts = parts;
	}

	@Override
	public Double getMaxWeight() {
		return this.maxWeight;
	}

	@Override
	public void setMaxWeight(Double maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public Integer getMaxCapacity() {
		return this.maxCapacity;
	}

	@Override
	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
}
