package com.sist.lib;

/*
 *	replace(char c1, char c2)
 * 			old      new
 *	replace(String s1, String s2)
 *          old        new
 *  replaceAll(String regex, String s)
 *             old           new ==>Á¤±Ô½Ä
 *             
 *  ¹®ÀÚÀÇ Çü½Ä
 *  211.238.142.181
 *  127.0.0.1
 *  211.63.64.10
 *  211.238.142.1
 *  
 *  [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3} 0~9±îÁöÀÇ ¼ýÀÚ°¡ 1°³¿¡¼­ 3°³°¡ ÀÖ´Ù!
 *  
 *  «ÀÖ´Â ¸ÀÀÖ°í ¸ÀÀÖ°Ô ¸ÀÀÖ°í....
 *  ¸ÀÀÖ+
*/
public class MainClass6 {
	public static void main(String[] args) {
		String s = "Hello Java";
		String s1= s.replace('a', 'b');
		System.out.println(s1);
		String s2 = s.replace("ll",	"LL");
		System.out.println(s2);
		String data = "AAABBBcccddd¾È³çÇÏ¼¼¿ä1234567890 ÀÚ¹ÙÀÔ´Ï´Ù";
		String ss = data.replaceAll("[A-Za-z0-9]", "");
		System.out.println(ss);
		String ss1 = data.replaceAll("[^A-Z]","");
		// [A-Z] => ¾ËÆÄºª ´ë¹®ÀÚ ÀüÃ¼
		// [^A-Z] => ´ë¹®ÀÚ¸¦ Á¦¿ÜÇÏ°í
		System.out.println(ss1);
		String ss2 = data.replaceAll("[^a-z]", "");
		System.out.println(ss2);
		String ss3 = data.replaceAll("[^0-9]", "");
		System.out.println(ss3);
		String ss4 = data.replaceAll("[^°¡-ÆR]", "");
		System.out.println(ss4);
		//ÇÑ±Û => °¡-ÆR
		//^ºÎÁ¤ (Á¦¿ÜÇÏ°í)
		//[^] ºÎÁ¤
		//^[°¡-ÆR] => ½ÃÀÛ (ÇÑ±Û·Î ½ÃÀÛÇÑ ¸ðµç ¹®ÀÚ)
		//[0-9]$ => ³¡ (¼ýÀÚ·Î ³¡³ª´Â ¸ðµç °Í)
		//^[°¡|³ª] ==> (°¡)or(³ª) ±ÛÀÚ·Î ½ÃÀÛÇÏ´Â ¸ðµç ¹®ÀÚ¿­
		// * (0¹øÀÌ»ó) µÚ¿¡ ±ÛÀÚ°¡ ÀÖÀ»¼öµµ ¾øÀ»¼öµµ ÀÖ´Ù.
		// + (1¹øÀÌ»ó) µÚ¿¡ ÇÑ±ÛÀÚ ÀÌ»ó ÀÖ¾î¾ßÇÑ´Ù.
		//^,$,|,+,* ==> »ç¿ëµÇ´Â ±âÈ£ ==> *, + ==> ½ÇÁ¦ ¹®ÀÚ¿¡¼­ Ã£±âÀ§ÇØ¼­´Â \\+ \\* ÀÌ·¸°Ô »ç¿ë 
	}
}
