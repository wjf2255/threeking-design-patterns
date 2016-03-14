package com.jackframe.design_patterns.chain;

/**
 * 
 * 定义半兽人指挥官。定义指挥官的业务是如果是防守城堡，则输出防守任务名称并且标记已经完成任务；否则执行下一个任务
 * 
 * @author wjf
 *
 */
public class OrcCommander extends RequestHandler {

	public OrcCommander(RequestHandler handler) {
	    super(handler);
	  }

	@Override
	public String toString() {
		return "Orc commander";
	}

	public void handleRequest(Request req) {
	    if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
	      printHandling(req);
	      req.markHandled();
	    } else {
	      super.handleRequest(req);
	    }
	  }
}
