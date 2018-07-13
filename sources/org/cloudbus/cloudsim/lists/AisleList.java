package org.cloudbus.cloudsim.lists;

import java.util.List;

import org.cloudbus.cloudsim.Aisle;

public class AisleList{
		
		public static<T extends Aisle> T getAisleById(List<T> AisleList,int Id) {
			for(T Aisle : AisleList) {
				if(Aisle.getAisleId() == Id) {
					return Aisle;
				}
			}
			return null;
		}


}