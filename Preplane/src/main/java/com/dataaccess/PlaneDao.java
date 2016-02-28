package com.dataaccess;

import java.util.List;

import com.buisnessobject.Plane;

public interface PlaneDao {
	/**
	 * Get list of plane 
	 * @return
	 */
	List<Plane> getPlanes();
	/**
	 * Get list of plane according to the following idplane
	 * @param idplane
	 * @return
	 */
	List<Plane> getPlanes(String idplane);
	/**
	 * Get list of plane according to the following capacity
	 * @param Capacity
	 * @return
	 */
	List<Plane> getPlanesCapa(int Capacity);
	
	
}
