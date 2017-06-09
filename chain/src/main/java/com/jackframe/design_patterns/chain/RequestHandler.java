package com.jackframe.design_patterns.chain;

/**
 * 定义请求处理。主要功能是定义只有下一个请求的引用和定义一个抽象的请求处理方法。
 * @author wjf
 *
 */
public abstract class RequestHandler {

	private RequestHandler next;
	
	public RequestHandler(RequestHandler next) {
	    this.next = next;
	  }
	
	public void handleRequest(Request req) {
	    if (next != null) {
	      next.handleRequest(req);
	    }
	  }
	
	protected void printHandling(Request req) {
	    System.out.println(this + " handling request \"" + req + "\"");
	  }
	
	public abstract String toString();
}
