package org.moonlightcontroller.managers.models.messages;

public class KeepAlive implements IMessage {
	private String type;
	private int xid;
	private int dpid;

	// Default constructor to support Jersy
	public KeepAlive() {}
		
	public KeepAlive(int xid, int dpid) {
		this.type = this.getClass().getName();
		this.xid = xid;
		this.dpid = dpid;
	}
	
	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public int getXid() {
		return xid;
	}
	
	@Override
	public void setXid(int xid) {
		this.xid = xid;
	}

	public int getDpid() {
		return dpid;
	}
}	
