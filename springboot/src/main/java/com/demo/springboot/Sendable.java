package com.demo.springboot;

public interface Sendable<T> {
	void send(T object);
}
