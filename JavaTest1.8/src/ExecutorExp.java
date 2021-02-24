import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.corba.se.impl.orbutil.closure.Future;

public class ExecutorExp {

	public static void main(String[] args) {
		ExecutorService ec = Executors.newFixedThreadPool(2);
		Runnable task= ()->{
			System.out.println("Hello Java");
			};
			ec.submit(task);
}
}