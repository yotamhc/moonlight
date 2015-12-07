package org.moonlightcontroller.managers.models.messages;

public class SuccessMessage implements IResponseMessage {
	
	private int xid;
	
	public SuccessMessage(int xid) {
		this.xid = xid;
	}
	
	@Override 
	public String toString() {
		return MessageResultType.OK.name();
	}

	@Override
	public int getXid() {
		return xid;
	}

	@Override
	public String getType() {
		return "success";
	}
}
