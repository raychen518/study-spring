package com.raychen518.study.spring.core.ioccontainer.javabasedcontainerconfiguration.beanannotation;

import org.springframework.context.SmartLifecycle;

public abstract class BeanH3 implements SmartLifecycle {

	private boolean autoStartup;
	private boolean running;

	public BeanH3(boolean autoStartup, boolean running) {
		this.autoStartup = autoStartup;
		this.running = running;
	}

	@Override
	public void start() {
		System.out.println(
				getClass().getSimpleName() + ": Starting the bean by implementing the SmartLifecycle interface...");
	}

	@Override
	public void stop() {
		System.out.println(
				getClass().getSimpleName() + ": Stopping the bean by implementing the SmartLifecycle interface...");
	}

	@Override
	public boolean isRunning() {
		return running;
	}

	@Override
	public int getPhase() {
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		return autoStartup;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println(getClass().getSimpleName()
				+ ": Stopping the bean with callback by implementing the SmartLifecycle interface...");
	}

}
