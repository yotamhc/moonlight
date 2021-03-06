package org.moonlightcontroller.blocks;

import org.moonlightcontroller.processing.ProcessingBlock;
import java.util.Map;
import org.moonlightcontroller.processing.BlockClass;

public class ToDump extends ProcessingBlock {
	private String filename;

	public ToDump(String id, String filename) {
		super(id);
		this.filename = filename;
	}

	public String getFilename() {
		return filename;
	}

	@Override
	public BlockClass getBlockClass() {
		return BlockClass.BLOCK_CLASS_TERMINAL;
	}

	@Override
	protected void putConfiguration(Map<String, Object> config) {
		config.put("filename", this.filename);
	}

	@Override
	protected ProcessingBlock spawn(String id) {
		return new ToDump(id, filename);
	}
}
