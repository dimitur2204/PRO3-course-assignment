package model;

import java.util.List;
import java.util.UUID;

public interface ITray {
	UUID getId();
	PartType getType();
	void setType(PartType type);
	List<IPart> getParts();
	void setParts(List<IPart> parts);
	Double getMaxWeight();
	void setMaxWeight(Double maxWeight);
	Integer getMaxCapacity();
	void setMaxCapacity(Integer maxCapacity);
}
