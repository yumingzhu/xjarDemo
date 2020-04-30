import io.xjar.XKit;
import io.xjar.boot.XBoot;
import io.xjar.key.XKey;

/**
 * @Description TODO
 * @Author yumigzhu
 * @Date 2020/4/30 14:04
 */
public class XjarDemo {

	public static void main(String[] args) throws Exception {
		// Spring-Boot Jar包加密
		String password = args[0];
		XKey xKey = XKit.key(password);
		XBoot.encrypt(args[1], args[2], xKey);
		System.out.println("Successfully generated encrypted jar");
	}
}



