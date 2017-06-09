package com.jackframe.design_patterns.builder;

/**
 * 
 * 三国英雄人物
 * 
 * @author wjf
 *
 */
public class Hero {

	private final Nation nation;
	private final Weapon weapon;
	private final Ability ability;
	private final Name name;
	
	public Hero(HeroBuilder heroBuilder) {
		this.name = heroBuilder.name;
		this.weapon = heroBuilder.weapon;
		this.ability = heroBuilder.ability;
		this.nation = heroBuilder.nation;
	}
	public Nation getNation() {
		return nation;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public Ability getAbility() {
		return ability;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(name != null) {
			sb.append("这个英雄名叫:"+name+",");
		} else {
			sb.append("这是一位无名英雄,");
		}
		if(nation != null) {
			sb.append("属于"+nation+"阵营,");
		} else {
			sb.append("是一个无业游民,");
		}
		if(weapon != null) {
			sb.append("惯用"+weapon+",");
		} else {
			sb.append("没钱买装备，惨惨惨！");
		}
		if(ability != null) {
			sb.append("具备"+ability+"神技！");
		} else {
			sb.append("居然是一个低能儿！");
		}
		if(sb.charAt(sb.length()-1) == ',') {
			sb.setCharAt(sb.length()-1, '!');
		}
		return sb.toString();
	}
	
	public static class HeroBuilder {
		private Nation nation;
		private Weapon weapon;
		private Ability ability;
		private final Name name;
		
		public HeroBuilder(Name name) {
			this.name = name;
		}
		
		public HeroBuilder setNation(Nation nation) {
			this.nation = nation;
			return this;
		}
		
		public HeroBuilder setWeapon(Weapon weapon) {
			this.weapon = weapon;
			return this;
		}
		
		public HeroBuilder setAbility(Ability ability) {
			this.ability = ability;
			return this;
		}
		
		public Hero build() {
			return new Hero(this);
		}
	}
}
