package com.jackframe.design_patterns.chain;

/**
 * 
 * 定义半兽人士兵。如果任务是收集税收，则打印任务名称，并标记已经完成任务；否则执行下一个任务。
 * 
 * @author wjf
 *
 */
public class OrcSoldier extends RequestHandler {

	public OrcSoldier(RequestHandler handler) {
		super(handler);
	}

	@Override
	public void handleRequest(Request req) {
		if (req.getRequestType().equals(RequestType.COLLECT_TAX)) {
			printHandling(req);
			req.markHandled();
		} else {
			super.handleRequest(req);
		}
	}

	@Override
	public String toString() {
		return "Orc soldier";
	}

}
