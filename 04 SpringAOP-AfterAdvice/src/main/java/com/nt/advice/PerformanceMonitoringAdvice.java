package com.nt.advice;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmAspect")
@Aspect()
public class PerformanceMonitoringAdvice {
	private long start, end;

	@Around("execution(double com.nt.service.IBankService.*(..))")
	public Object performance(ProceedingJoinPoint pjp) throws Throwable {
		// pre logic
		start = System.currentTimeMillis();
		System.out.println("PerformanceMonitoringAdvice.performance() before entering" + new Date());

		// changing b.method args values
		Object args[] = pjp.getArgs();
		if (((Double) args[0]) <= 100000) {
			args[1] = ((Double) args[1]) - 0.5;
		}
		// controlling the target method execution
		if (((Double) args[0]) <= 0 || ((Double) args[1]) <= 0 || ((Double) args[2]) <= 0)
			throw new IllegalArgumentException("Invalid Argument value");
		// invoke b.method
		Object retVal = pjp.proceed(args);
		// post logic
		end = System.currentTimeMillis();
		System.out.println("PerformanceMonitoringAdvice.performance() After Exiting" + new Date());
		System.out.println(pjp.getSignature() + " With args  " + Arrays.toString(pjp.getArgs()) + " has taken "
				+ (end - start) + " ms to complete the execution");
          // modify return value
		//retVal=(double)retVal+(double)retVal*20;
		return retVal;

	}

}
