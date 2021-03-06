package manager;

import java.nio.ByteBuffer;

import constant.Constant;

public class Frame {
	
	private ByteBuffer buffer;
	private PageId pageId;
	private int pinCount;
	private boolean dirty,	
				refBit;
	
	public Frame() {
		buffer.allocate((int) Constant.PAGESIZE);
		pageId = null;
		pinCount = 0;
		dirty = false;
		refBit = false;
	}

	public ByteBuffer getBuffer() {
		return buffer;
	}

	public void setBuffer(ByteBuffer buffer) {
		this.buffer = buffer;
	}

	public PageId getPageId() {
		return pageId;
	}

	public void setPageId(PageId pageId) {
		this.pageId = pageId;
	}

	public int getPinCount() {
		return pinCount;
	}

	public void setPinCount(int pinCount) {
		this.pinCount = pinCount;
	}

	public boolean getRefBit() {
		return refBit;
	}

	public void setRefBit(boolean refBit) {
		this.refBit = refBit;
	}

	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}	
	
	

}
