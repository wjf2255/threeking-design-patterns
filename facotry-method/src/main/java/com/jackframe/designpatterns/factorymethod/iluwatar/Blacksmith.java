package com.jackframe.designpatterns.factorymethod.iluwatar;

/**
 *
 * The interface containing method for producing objects.
 *
 */
public interface Blacksmith {

  Weapon manufactureWeapon(WeaponType weaponType);

}