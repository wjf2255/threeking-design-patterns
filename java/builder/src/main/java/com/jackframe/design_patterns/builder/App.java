package com.jackframe.design_patterns.builder;

import com.jackframe.design_patterns.builder.Hero.HeroBuilder;

/**
 * 
 * 建造者模式是是一种为了解决复杂和繁多的构造函数而设计的一种反面设计模式(anti-pattern)。
 * 反面设计模式是指在现实编程中经常发生，但是却比较低效并亟待提升的一类设计模式。
 * 在现实编程中，由于存在复杂的数据结构和不同使用环境，我们需要建设许多的构造函数供外部使用。随着外部环境的不断变更，需要的构造函数成指数增加。
 * 此时我们可以利用建造者模式帮助我们构建。建造者模式可以构建复杂数据结构的每个部分，再在最后返回这个复杂数据结构体的实例。
 * 
 * 建造者模式还有一个优势是：如果创建的复杂结构体包含非常复杂的数据结构，并且需要创建时就初始化这些结构体，
 * 那么利用构造函数去初始化这些结构体将是一件非常僵硬并且并且麻烦的事情。这时利用建造者模式，可以
 *
 */
public class App {
	public static void main(String[] args) {
		Hero liubei = (new HeroBuilder(Name.LIUBEI)).setNation(Nation.SHU)
				.setAbility(Ability.DUNZOU).setWeapon(Weapon.CHIXIONGSHUANGJIAN).build();
		System.out.println(liubei.toString());
		
		Hero zhangfei = (new HeroBuilder(Name.ZHANGFEI)).setNation(Nation.SHU)
				.setAbility(Ability.BAQICELOU).setWeapon(Weapon.BANGZHANGSHEMAO).build();
		System.out.println(zhangfei);
	}
}
