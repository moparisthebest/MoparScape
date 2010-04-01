package com.rs2hd.util;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Scripts {
	
	private static ScriptEngineManager mgr = new ScriptEngineManager();
	@SuppressWarnings("unused")
	private static ScriptEngine engine;
	
	public static void init() {
		engine = mgr.getEngineByName("JavaScript");
	}

}
