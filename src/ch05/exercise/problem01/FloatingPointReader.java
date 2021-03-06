package ch05.exercise.problem01;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FloatingPointReader {
	public ArrayList<Double> readValues(String filename) throws IOException {
		ArrayList<Double> values = new ArrayList<>();
		try (Scanner in = new Scanner(Paths.get(filename))) {
			while (in.hasNext()) {
				values.add(in.nextDouble());
			}
		}
		
		return values;
	}
}
