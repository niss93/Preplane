package dataaccess;

import java.util.List;

import buisnessobject.Plane;

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
	
	void addPlane(Plane p);
	void delete (Plane plane);
	void update (int id,String planeModel,int planeCapacity);
	/**
	 * Return the plane of corresponding id
	 * @param idPlane
	 * @return
	 */
	Plane getPlane(int idPlane);
	
	
}
