package com.firdos.Assignment9;
import java.io.IOException;
import java.sql.SQLException;

public class Throws {
	void display(boolean exception) throws IOException,SQLException{
		
		if(exception) {
			throw new SQLException("Simulated SQLException");
			
		}else {
		
		throw new IOException();
	
	}
	}

		void loadclass(String className) throws ClassNotFoundException  {
			
			throw new ClassNotFoundException("Simulated ClassNotFoundException");
		
}
}

