package model.services;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class PrintService<T>{

	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new InvalidParameterException("List is empty!");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		for(T obj : list) {
			if (obj == list.get(0)) {
				System.out.print(obj);
			}else {
				System.out.print("," + obj);
			}
		}
		System.out.print("]");
	}
}