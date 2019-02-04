package fiduciagad.de.sft.main;

import java.util.Date;

public class BallPosition {

	private int xCoordinate;
	private int yCoordinate;
	private Date timepoint;
	
	public BallPosition(int xCoordinate, int yCoordinate, Date timepoint) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.timepoint = timepoint;
	}

	public BallPosition() {
	}

	public int getXCoordinate() {
		return xCoordinate;
	}

	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getYCoordinate() {
		return yCoordinate;
	}

	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public void setTimepoint(long timepoint) {
		this.timepoint = new Date(timepoint);
	}

	public Date getTimepoint() {
		return timepoint;
	}

}