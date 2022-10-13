package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(211, 255, 162);
		StdDraw.filledRectangle(0.25, 0.5, 0.23, 0.40);
		StdDraw.filledRectangle(0.75, 0.5, 0.23, 0.40);
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(142, 191, 63);
		StdDraw.rectangle(0.25, 0.5, 0.23, 0.40);
		StdDraw.rectangle(0.75, 0.5, 0.23, 0.40);
		StdDraw.setPenColor(184, 242, 146);
		StdDraw.filledCircle(0.25, 0.5, 0.11);
		StdDraw.filledCircle(0.75, 0.5, 0.11);
		StdDraw.setPenColor(118, 171, 62);
		StdDraw.filledCircle(0.25, 0.5, 0.09);
		StdDraw.filledCircle(0.75, 0.5, 0.09);
	}
}