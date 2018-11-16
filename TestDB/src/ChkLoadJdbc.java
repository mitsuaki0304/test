/**
 *
 */

/**
 * @author testuser
 *
 */
public class ChkLoadJdbc {

	public static void main(String[] args) throws InstantiationException,
	IllegalAccessException {
		// TODO 自動生成されたメソッド・スタブ

		String msg="";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ドライバーのダウンロードに成功しました";
		} catch (ClassNotFoundException e) {
			msg="ドライバーのダウンロードに失敗しました";
		}
		System.out.println(msg);
	}

}
