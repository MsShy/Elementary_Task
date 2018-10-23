package Task2.entity;

import exception.ParameterValidateException;
import validation.Validator;

public class Envelope {

	private double height;
	private double width;

	public Envelope(double height,double width) throws ParameterValidateException {
		setHeight(height);
		setWidth(width);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(final double width) throws ParameterValidateException {
		Validator.isPositive(width,"width of envelope");
		this.width = width;
	}

	public void setHeight(final double height) throws ParameterValidateException {
		Validator.isPositive(height,"height of envelope");
		this.height = height;
	}

}
