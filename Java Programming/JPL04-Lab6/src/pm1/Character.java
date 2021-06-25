/* 1748022 김유진
 * (실습1) 게임 캐릭터 만들기
 * */

package pm1;

public abstract class Character {
	
	private String charName;
	static String selectedCharacter = "";
	
	public Character(String charName) {
		this.charName = charName;
	}

	public static void setSelectedCharacter(String selectedCharacter) {
		Character.selectedCharacter = selectedCharacter;
	}


	public abstract void characterSkill();
	public void apppendCharacter() {
		selectedCharacter += "+";
		selectedCharacter += charName;
	}

}
