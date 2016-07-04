package com.raychen518.study.spring.core.ioccontainer.customizingbeannature.startupandshutdowncallbacks;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.SmartLifecycle;

public class BeanC implements SmartLifecycle {

	@PostConstruct
	public void doInitialization() {
		System.out.println(getClassName() + ": Initializing...");
	}

	@PreDestroy
	public void doDestroying() {
		System.out.println(getClassName() + ": Destroying...");
	}

	@Override
	public void start() {
		System.out.println(getClassName() + ": Starting...");
	}

	@Override
	public void stop() {
		System.out.println(getClassName() + ": Stopping...");
	}

	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public int getPhase() {
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		return false;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println(getClassName() + ": Stopping with callback...");
	}

	private String getClassName() {
		return getClass().getSimpleName();
	}

}
