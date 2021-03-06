package headfirst.design.JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PorxyHandle implements InvocationHandler {
	private Object target;

	public Object bind(Object obj) {
		target = obj;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		Object obj = null;

		obj = method.invoke(target, args);

		return obj;
	}

}
