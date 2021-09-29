package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000-0000-2222");
		
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
		mobilePhone.call("99-8888-77777");
		Interface01.classTakePicture(mobilePhone);
		
		mobilePhone.powerOff();
		}
    public static void classTakePicture(Camera camera) {
        camera.takePicture();
    }
 
}
