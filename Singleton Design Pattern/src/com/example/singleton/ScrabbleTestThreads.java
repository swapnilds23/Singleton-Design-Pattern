package com.example.singleton;

public class ScrabbleTestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new Thread created using the Runnable interface
				// Execute the code in run after 10 seconds
						
				Runnable getTiles = new GetTheTiles();
						
				Runnable getTilesAgain = new GetTheTiles();
						
				// Call for the code in the method run to execute
						
				new Thread(getTiles).start();
				new Thread(getTilesAgain).start();
	}

}
