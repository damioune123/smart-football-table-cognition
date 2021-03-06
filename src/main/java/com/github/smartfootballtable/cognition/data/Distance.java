package com.github.smartfootballtable.cognition.data;

import com.github.smartfootballtable.cognition.data.unit.DistanceUnit;

import lombok.Generated;

public class Distance {

	private final double value;
	private final DistanceUnit distanceUnit;

	public Distance(double value, DistanceUnit distanceUnit) {
		this.value = value;
		this.distanceUnit = distanceUnit;
	}

	public double value(DistanceUnit target) {
		return target.convert(value, distanceUnit);
	}

	public DistanceUnit unit() {
		return distanceUnit;
	}

	public Distance add(Distance other) {
		if (other.distanceUnit == distanceUnit) {
			return new Distance(other.value + value, distanceUnit);
		}
		// TODO convert to lower of other.distanceUnit and distanceUnit and add
		throw new IllegalStateException("not yet implemented");
	}

	@Generated
	@Override
	public String toString() {
		return "Distance [value=" + value + ", distanceUnit=" + distanceUnit + "]";
	}

}