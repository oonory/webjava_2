package jp.co.systena.tigerscave.MonsterBattle.application.model;

public class Monster {

  // 名前
  private String name;
  // 体力
  private int hitpoint;
  // 素早さ
  private int agility;
  // タイプ
  private int type;

  public Monster() {
  }

  public String getName() {
    return this.name;
  }
  // setter
  public void setName(String name) {
    this.name = name;
  }

  public int getHitpoint() {
    return this.hitpoint;
  }
  // setter
  public void setHitpoint(int hitpoint) {
    this.hitpoint = hitpoint;
  }

  public int getAgility() {
    return this.agility;
  }
  // setter
  public void setAgility(int agility) {
    this.agility = agility;
  }

  public int getType() {
    return this.type;
  }
  // setter
  public void setType(int type) {
    this.type = type;
}
}
