package practice.jump;

public class Naruto extends Jump {
	private String skill;

	public Naruto(String name, String dream, String skill) {
	        super(name, dream);
	        this.skill = skill;
	    }

	public String getProfile() {
		String profile = super.dream + "に俺はなる！！";
		profile += "世界を救った術は" + this.skill;
		return profile;
	}
}
