package compiler.geninterp;

import java.io.Serial;
import java.io.Serializable;

public class CodeArguments implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;
	private final int code;
	private Object argument;

	public int getCode() {
		return code;
	}

	public Object getArgument() {
		return argument;
	}

	public void setArgument(Object arg) {
		argument = arg;
	}

	public CodeArguments(int specialVar, Object arg) {
		code = specialVar;
		argument = arg;
	}

}
