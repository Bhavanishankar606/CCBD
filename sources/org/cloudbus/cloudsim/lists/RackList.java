package org.cloudbus.cloudsim.lists;

import java.util.List;
import org.cloudbus.cloudsim.Rack;



public class RackList {
	
	public static<T extends Rack> T getRackById(List<T> RackList,int Id) {
		for(T Rack : RackList) {
			if(Rack.getRackId() == Id) {
				return Rack;
			}
		}
		return null;
	}

}
