package practice.jump;

public class Jump01 {
	public static void main(String[] args) {
//		子クラスでで意義したデータ型に当てはめる
		Jump hero1 = new Onepiece("ルフィ", "海賊王",10);
		System.out.println(hero1.getProfile());
		
//		それぞれ子クラスで定義したデータが出力される
		Jump hero2 = new Naruto("ナルト", "火影","逆ハーレムの術");
		System.out.println(hero2.getProfile());
	}

}
