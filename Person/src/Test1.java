

public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-1111-1111";
		taro.address="東京";
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro =new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="000-2222-2222";
		jiro.address="千葉";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		jiro.talk();
		jiro.walk();
		jiro.run();

		Person hanako =new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="000-3333-1111";
		hanako.address="神奈川";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person mitsuaki =new Person();
		mitsuaki.name="毛谷村光明";
		mitsuaki.age=24;
		mitsuaki.phoneNumber="000-1111-1111";
		mitsuaki.address="東京";
		System.out.println(mitsuaki.name);
		System.out.println(mitsuaki.age);
		mitsuaki.talk();
		mitsuaki.walk();
		mitsuaki.run();

		Robot aibo = new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();



	}

}
