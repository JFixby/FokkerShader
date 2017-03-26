
package com.jfixby.r3.fokker.assets.api.shader.io;

import java.io.Serializable;

public class ShaderParameterInfo implements Serializable {
	private static final long serialVersionUID = 8458598392106057254L;

	public static final String TYPE_FLOAT = "float";
	public static final String TYPE_INT = "int";

	public String name;
	public String type;

	public ShaderParameterInfo (final String name, final String type) {
		this.name = name;
		this.type = type;
	}

	public ShaderParameterInfo () {
	}

}
