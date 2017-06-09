package com.jackframe.design_patterns.chain;

/**
 * 
 * 定义半兽人文职人员。主要工作是，如果执行折磨囚犯，则打印工作内容，并标记已完成工作；否则执行下一个任务。
 * 
 * @author wjf
 *
 */
public class OrcOfficer extends RequestHandler {

	public OrcOfficer(RequestHandler handler) {
	    super(handler);
	  }

	  @Override
	  public void handleRequest(Request req) {
	    if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
	      printHandling(req);
	      req.markHandled();
	    } else {
	      super.handleRequest(req);
	    }
	  }

	  @Override
	  public String toString() {
	    return "Orc officer";
	  }
}
