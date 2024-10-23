package com.ust.awslambda;

import com.amazonaws.services.lambda.runtime.Context;

public class TestLambda {
//	public int status(int x) {
//		return x*x;
//	}
//public String status(String x) {
//	Integer x1=Intger.parseInt(x);
//}
	
	
	public String handleRequest(Data obj,Context context) {
		return (obj.getX()+obj.getY())+"";
	}
}
