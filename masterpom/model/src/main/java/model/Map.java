package model;

public class Map {

	private int idMap;
	private int width;
	private int height;
	private int playerStartX;
	private int playerStartY;
	private String mapFromBDD;
	
	public Map(int idMap, int width, int height, int playerStartX, int playerStartY, String mapFromBDD){
		this.setIdMap(idMap);
		this.setWidth(width);
		this.setHeight(height);
		this.setPlayerStartX(playerStartX);
		this.setPlayerStartY(playerStartY);
		this.setMapFromBDD(mapFromBDD);
	}

	public int getIdMap() {
		return idMap;
	}

	public void setIdMap(int idMap) {
		this.idMap = idMap;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPlayerStartX() {
		return playerStartX;
	}

	public void setPlayerStartX(int playerStartX) {
		this.playerStartX = playerStartX;
	}

	public int getPlayerStartY() {
		return playerStartY;
	}

	public void setPlayerStartY(int playerStartY) {
		this.playerStartY = playerStartY;
	}

	public String getMapFromBDD() {
		return mapFromBDD;
	}

	public void setMapFromBDD(String mapFromBDD) {
		this.mapFromBDD = mapFromBDD;
	}
}
