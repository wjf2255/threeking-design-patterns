package com.jackframe.design_patterns.chain;

/**
 * 
 * 定义半兽人国王。主要功能包括创建一个执行者队列和发送命令。
 * 
 * @author wjf
 *
 */
public class OrcKing {

	RequestHandler chain;

	  public OrcKing() {
	    buildChain();
	  }

	  private void buildChain() {
	    chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
	  }

	  public void makeRequest(Request req) {
	    chain.handleRequest(req);
	  }
}
