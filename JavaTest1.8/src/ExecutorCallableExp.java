import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExecutorCallableExp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Runnable runnable = () -> {
			System.out.println("Runnable task");
		};
		Future<String> result = executor.submit(runnable, "DONE");
		String str = result.get();
		System.out.println("str="+str);
		
		Callable callable = () -> {
			return "Hello Callable";
		};		
		
		Future<String> callableResult = executor.submit(callable);
		String callableOutput= callableResult.get();
		System.out.println("str="+callableOutput);
	}
}

