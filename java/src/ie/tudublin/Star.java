package ie.tudublin;


public class Star {

    private boolean hab;
    private String displayName;
    private float distance;
    private float xG, yG, zG;
    private float absMag;

    /**
  	* Default empty Star constructor
  	*/
  	public Star() {
  		super();
  	}

  	/**
  	* Default Star constructor
  	*/
  	public Star(boolean hab, String displayName, float distance, float xG, float yG, float zG, float absMag) {
  		super();
  		this.hab = hab;
  		this.displayName = displayName;
  		this.distance = distance;
  		this.xG = xG;
  		this.yG = yG;
  		this.zG = zG;
  		this.absMag = absMag;
  	}



	/**
	* Returns value of hab
	* @return
	*/
	public boolean isHab() {
		return hab;
	}

	/**
	* Sets new value of hab
	* @param
	*/
	public void setHab(boolean hab) {
		this.hab = hab;
	}

	/**
	* Returns value of displayName
	* @return
	*/
	public String getDisplayName() {
		return displayName;
	}

	/**
	* Sets new value of displayName
	* @param
	*/
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	* Returns value of distance
	* @return
	*/
	public float getDistance() {
		return distance;
	}

	/**
	* Sets new value of distance
	* @param
	*/
	public void setDistance(float distance) {
		this.distance = distance;
	}

	/**
	* Returns value of xG
	* @return
	*/
	public float getXG() {
		return xG;
	}

	/**
	* Sets new value of xG
	* @param
	*/
	public void setXG(float xG) {
		this.xG = xG;
	}

	/**
	* Returns value of yG
	* @return
	*/
	public float getYG() {
		return yG;
	}

	/**
	* Sets new value of yG
	* @param
	*/
	public void setYG(float yG) {
		this.yG = yG;
	}

	/**
	* Returns value of zG
	* @return
	*/
	public float getZG() {
		return zG;
	}

	/**
	* Sets new value of zG
	* @param
	*/
	public void setZG(float zG) {
		this.zG = zG;
	}

	/**
	* Returns value of absMag
	* @return
	*/
	public float getAbsMag() {
		return absMag;
	}

	/**
	* Sets new value of absMag
	* @param
	*/
	public void setAbsMag(float absMag) {
		this.absMag = absMag;
	}


	/**
	* Create string representation of Star for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Star [hab=" + hab + ", displayName=" + displayName + ", distance=" + distance + ", xG=" + xG + ", yG=" + yG + ", zG=" + zG + ", absMag=" + absMag;
	}

  
}
