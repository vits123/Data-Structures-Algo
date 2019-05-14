package com.JavaFeatures.demo;

public interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}
