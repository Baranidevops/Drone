package com.drone.driver;

import com.drone.common.Directions;

/**
 * @see com.drone.driver.Driver
 */
public class DriverImpl implements Driver {

    /**
     * @see com.drone.driver.Driver#getUrbanizationId()
     */
    public String getUrbanizationId(Double coordinateX, Double coordinateY) {
        return "13";
    }

    /**
     * @see com.drone.driver.Driver#getAdjacent()
     */
    public String getAdjacent(String urbanizationId, Directions direction) {

        String r = "";
        
        if (direction.equals(Directions.UP)) {
        	r = "8";
        } 
        if (direction.equals(Directions.DOWN)) {
        	r = "18";
        } 
        if (urbanizationId.equals("13") && direction.equals(Directions.LEFT)) {
            r = "12";
        } 
        if (urbanizationId.equals("13") && direction.equals(Directions.RIGHT)) {
            r = "14";
        } 
        if (urbanizationId.equals("8") && direction.equals(Directions.RIGHT)) {
            r = "9";
        } 
        if (urbanizationId.equals("8") && direction.equals(Directions.LEFT)) {
            r = "7";
        } 
        if (urbanizationId.equals("18") && direction.equals(Directions.RIGHT)) {
            r = "19";
        } 
        if (urbanizationId.equals("18") && direction.equals(Directions.LEFT)) {
            r = "17";
        }
        
        return r;
    }
}
