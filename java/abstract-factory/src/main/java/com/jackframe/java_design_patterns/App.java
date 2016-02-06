package com.jackframe.java_design_patterns;

import com.jackframe.java_design_patterns.shu.ShuKingdomFactory;
import com.jackframe.java_design_patterns.wei.WeiKingdomFactory;
import com.jackframe.java_design_patterns.wu.WuKingdomFactory;



/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		App app = new App();
		System.out.println("--------曹魏政权----------");
		KingdomFactory weiKingdomFactory = app.getWeiKingdomFactory();
		Kingdom weiKingdom = weiKingdomFactory.createKindom();
		System.out.println(weiKingdom.getName());
		System.out.println(weiKingdomFactory.createKing().getName());
		System.out.println(weiKingdomFactory.createCity().getName());
		General weigeneral = weiKingdomFactory.createGeneral(weiKingdom);
		System.out.println(weigeneral.getName() + " - " + weigeneral.getNationality());
		Politician shupolitician = weiKingdomFactory.createPolitician(weiKingdom);
		System.out.println(shupolitician.getName()+" - "+shupolitician.getNationality());
		
		System.out.println("--------蜀汉政权----------");
		KingdomFactory shuKingdomFactory = app.getShuKingdomFactory();
		Kingdom shuKingdom = weiKingdomFactory.createKindom();
		System.out.println(shuKingdom.getName());
		System.out.println(shuKingdomFactory.createKing().getName());
		System.out.println(shuKingdomFactory.createCity().getName());
		General shuGeneral = shuKingdomFactory.createGeneral(shuKingdom);
		System.out.println(shuGeneral.getName() + " - " + shuGeneral.getNationality());
		Politician shuPolitician = shuKingdomFactory.createPolitician(shuKingdom);
		System.out.println(shuPolitician.getName()+" - "+shuPolitician.getNationality());
		
		System.out.println("--------东吴政权----------");
		KingdomFactory wuKingdomFactory = app.getWuKingdomFactory();
		Kingdom wuKingdom = wuKingdomFactory.createKindom();
		System.out.println(wuKingdom.getName());
		System.out.println(wuKingdomFactory.createKing().getName());
		System.out.println(wuKingdomFactory.createCity().getName());
		General wuGeneral = wuKingdomFactory.createGeneral(shuKingdom);
		System.out.println(wuGeneral.getName() + " - " + wuGeneral.getNationality());
		Politician wuPolitician = wuKingdomFactory.createPolitician(shuKingdom);
		System.out.println(wuPolitician.getName()+" - "+wuPolitician.getNationality());
	}
	
	KingdomFactory getWuKingdomFactory() {
		return new WuKingdomFactory();
	}
	KingdomFactory getShuKingdomFactory() {
		return new ShuKingdomFactory();
	}
	WeiKingdomFactory getWeiKingdomFactory() {
		return new WeiKingdomFactory();
	}
}
