/* 1748022 ������
 * (�ǽ�1) ���� ĳ���� �����
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
