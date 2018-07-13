package org.cloudbus.cloudsim;

import java.util.List;

import org.cloudbus.cloudsim.Rack;

public class Aisle{
	
	private int id;
	
	private String name;
	
	private List<? extends Rack> RackList;
	
	private Datacenter datacenter;
	
	//Instantiates new Rack
	public Aisle(String name,int id,List<Rack> RackList) {
		setName(name);
		setAisleId(id);
		Log.printLine(RackList);
		
	}
	

	public Aisle(int id,List<Rack> RackList) {
		this.id=id;
		this.RackList=RackList;
		
	}
	
	
	//copy constructor
	public Aisle(Aisle r) {
		this.name="";
		this.id=r.getAisleId();
		this.RackList=r.getRackList();
		
	}
	
	//sets the name of the sector
		public void setName(String name) {
			this.name = name;
		}
		
		//returns the name of the sector
		public String getName() {
			return name;
		}
		
		//returns the sectorId
		public int getAisleId() {
			return id;
		}
		
		//sets the sectorId
		public void setAisleId(int Id) {
			this.id = Id;
		}

	

	//set datacenter
		public void setDatacenter(Datacenter datacenter)
		{
			this.datacenter = datacenter;
		}
		
		//get datacenter
		public Datacenter getDatacenter()
		{
			return datacenter;
		}
		
		public List<? extends Rack> getRackList()
		{
			return this.RackList;
		}

	

}
