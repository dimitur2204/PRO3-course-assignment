package model;

import java.util.UUID;

public interface IPart {
	UUID getId();
	Double getWeight();
	Register getRegister();
	PartType getType();
}
