package com.example.factory;

public class BasicPackage extends Package {

	@Override
	protected void createPackage() {
		// TODO Auto-generated method stub
		decorations.add(new BridalDeco());
	}

}
