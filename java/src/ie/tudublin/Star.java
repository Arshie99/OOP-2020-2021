<<<<<<< Updated upstream
package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Star {
    private boolean hab;
    private String displayName;
    private float distance;
    private float xG,yG,zG;
    private float absMag;

    public Star()
    {
        
    }

    public void render(PApplet pa)
    {
        float border = pa.width * 0.1f;
        float x = PApplet.map(xG, -5, 5, border, pa.width - border);
        float y = PApplet.map(yG, -5, 5, border, pa.width - border);
        pa.stroke(255, 255, 0);
        pa.line(x - 5, y, x + 5, y);
        pa.line(x, y - 5, x, y + 5);
        pa.stroke(255, 0, 0);
        pa.noFill();
        pa.circle(x, y, absMag);
        pa.fill(255);
        pa.textAlign(PApplet.LEFT, PApplet.CENTER);
        pa.text(displayName, x + 10, y);
    }

    public Star(TableRow row)
    {
        // Constructor chaining
        this(
            row.getInt("Hab?") == 1 ? true : false,
            row.getString("Display Name"),
            row.getFloat("Distance"),
            row.getFloat("Xg"),
            row.getFloat("Yg"),
            row.getFloat("Zg"),
            row.getFloat("AbsMag")
        );
    }

    public Star(boolean hab, String displayName, float distance, float xG, float yG, float zG, float absMag)
    {
        this.hab = hab;
        this.displayName = displayName;
        this.distance = distance;
        this.xG = xG;
        this.yG = yG;
        this.zG = zG;
        this.absMag = absMag;
    }
    
    public boolean isHab() {
        return hab;
    }

    public void setHab(boolean hab) {
        this.hab = hab;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getxG() {
        return xG;
    }

    public void setxG(float xG) {
        this.xG = xG;
    }

    public float getyG() {
        return yG;
    }

    public void setyG(float yG) {
        this.yG = yG;
    }

    public float getzG() {
        return zG;
    }

    public void setzG(float zG) {
        this.zG = zG;
    }

    public float getAbsMag() {
        return absMag;
    }

    public void setAbsMag(float absMag) {
        this.absMag = absMag;
    }

    @Override
    public String toString() {
        return "Star [absMag=" + absMag + ", displayName=" + displayName + ", distance=" + distance + ", hab=" + hab
                + ", xG=" + xG + ", yG=" + yG + ", zG=" + zG + "]";
    }
}
=======
package ie.tudublin;

import processing.data.TableRow;

public class Star {

    private boolean hab;
    private String displayName;
    private float distance;
    private float xG, yG, zG;
    private float absMag;

    /**
  	* Default empty Star constructor
    * @param row
  	*/
  	public Star(TableRow row) {
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
>>>>>>> Stashed changes
