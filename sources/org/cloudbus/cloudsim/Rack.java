package org.cloudbus.cloudsim;

import java.util.List;

import org.cloudbus.cloudsim.Host;

public class Rack {
	
	private int id;
	
	private String name;
	
	private List<? extends Host> HostList;
	
	private Datacenter datacenter;
	
	//Instantiates new Rack
	public Rack(String name,int id,List<Host> HostList) {
		setName(name);
		setRackId(id);
		Log.printLine("In Rack");
		
	}
	

	public Rack(int id,List<Host> HostList) {
		this.id=id;
		this.HostList=HostList;
		
	}
	
	
	//copy constructor
	public Rack(Rack r) {
		this.name="";
		this.id=r.getRackId();
		this.HostList=r.getHostList();
		
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
		public int getRackId() {
			return id;
		}
		
		//sets the sectorId
		public void setRackId(int Id) {
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
		
		public List<? extends Host> getHostList()
		{
			return this.HostList;
		}

	

}
