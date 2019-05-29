package model;

import java.util.Observable;

import contract.model.IElement;
import contract.model.IMap;

public class Map extends Observable implements IMap{

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobileHasChanged() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMap() {
		// TODO Auto-generated method stub
		
	}

}
