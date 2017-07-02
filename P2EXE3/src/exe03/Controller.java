package exe03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Controller {
	private Object model;
	private Object view;

	public Controller(Object model, Object view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) throws Exception {
		Method method = model.getClass().getMethod("setName", String.class);
		method.invoke(model, name);
	}

	public String getName() throws Exception {
		Method method = model.getClass().getMethod("getName");
		return (String) method.invoke(model);
	}

	public void setRollNo(String rollNo) throws Exception {
		Method method = model.getClass().getMethod("setsetRollNoName", String.class);
		method.invoke(model, rollNo);
	}

	public String getRollNo() throws Exception {
		Method method = model.getClass().getMethod("getRollNo");
		return (String) method.invoke(model);
	}

	public void updateView() throws Exception {
		Method method = view.getClass().getMethod("printDetails", String.class, String.class);
		method.invoke(view, getName(), getRollNo());
	}

}
