package org.tnsif.assignment;

class WoodenBero extends Bero{
private String woodType;
public WoodenBero(String beroType, String beroColour, String woodType) {
    super(beroType, beroColour);
    this.woodType = woodType;
}


public String getWoodType() {
	return woodType;
}

public void setWoodType(String woodType) {
	this.woodType = woodType;
}
public void calculatePrice() {
    switch (woodType) {
        case "Ply Wood":
            setPrice(15000);
            break;
        case "Teak Wood":
            setPrice(12000);
            break;
        case "Engineered Wood":
            setPrice(10000);
            break;
    }
}



}




