package com.jackframe.design_patterns.chain;

/**
 * 
 * 责任链模式由命令和执行者组成。每一个执行者都有一段执行逻辑对应执行一种命令。
 * 如果改执行者拿到不是它对应能够执行逻辑的命令，那么将该命名交给下一个执行者。
 * 
 * @author wjf
 *
 */
public class App {
	public static void main(String[] args) {
		OrcKing king = new OrcKing();
		king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
		king.makeRequest(new Request(RequestType.TORTURE_PRISONER,
				"torture prisoner"));
		king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
	}
}
