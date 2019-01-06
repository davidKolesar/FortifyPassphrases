import static org.junit.Assert.*;

import org.junit.Test;


public class PlayPassTest {

	@Test
	public void test1() {
		assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
	}
	@Test
	public void test2() {
		assertEquals("!!!uOy eVoL I", PlayPass.playPass("I LOVE YOU!!!", 0));
	}
	@Test
	public void test3() {
		assertEquals("zDdCcBbB", PlayPass.playPass("AAABBCCY", 1));
	}
	@Test
	public void test4() {
		assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO", 
				PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
	}
	@Test
	public void test5() {
		assertEquals(".ySjWjKkNi jWf xIjJs wZtD JgDfR ...dJm yZg sJyKt tTy qTtY YcJy xNmY JxZ Y'StI N ZtD MyNb yXjStM Jg tY", 
				PlayPass.playPass("TO BE HONEST WITH YOU I DON'T USE THIS TEXT TOOL TOO OFTEN BUT HEY... MAYBE YOUR NEEDS ARE DIFFERENT.", 5));
	}
	@Test
	public void test6() {
		assertEquals("...gYnMsM SuJ HiTuGu yBn gIlZ MyMuLbJmMuJ XyMsFuHu mLyBwLuYmYl sNcMlYpChO YaXcLvGuW IqN 7897 hC", 
				PlayPass.playPass("IN 2012 TWO CAMBRIDGE UNIVERSITY RESEARCHERS ANALYSED PASSPHRASES FROM THE AMAZON PAY SYSTEM...", 20));
	}
	@Test
	public void test7() {
		assertEquals("...wOdCiC IkZ XyJkWk oRd wYbP CoCkBrZcCkZ NoCiVkXk cBoRmBkOcOb iDsCbOfSxE OqNsBlWkM YgD 7897 xS", 
				PlayPass.playPass("IN 2012 TWO CAMBRIDGE UNIVERSITY RESEARCHERS ANALYSED PASSPHRASES FROM THE AMAZON PAY SYSTEM...", 10));
	}
	@Test
	public void test8() {
		assertEquals("JsNs0yMlNj1sJaJx2cNx3jAnK4WzTk5jJwMy6tBy7jSt8", PlayPass.playPass("1ONE2TWO3THREE4FOUR5FIVE6SIX7SEVEN8EIGHT9NINE", 5));
	}
	@Test
	public void test9() {
		assertEquals("bA12345678aB", PlayPass.playPass("AZ12345678ZA", 1));
	}
	@Test
	public void test10() {
		assertEquals("I LoVe yOu!!!", PlayPass.playPass("!!!VPZ FWPM J", 25));
	}
	@Test
	public void test11() {
		assertEquals(")-:gTwIpU GjDn h'iX ?bXw tTh dI StIcPl jDn !NdQ", 
				PlayPass.playPass("BOY! YOU WANTED TO SEE HIM? IT'S YOUR FATHER:-)", 15));
	}
	@Test
	public void test12() {
		assertEquals(".hTrXkGtH ScP HtIxH TjFxCj gD IcTgTuUxS HhDgRp sThJtG Tq iDc hThPgWeHhPe iPwI StScTbBdRtG Hx iX CdHpTg hXwI GdU", 
				PlayPass.playPass("FOR THIS REASON IT IS RECOMMENDED THAT PASSPHRASES NOT BE REUSED ACROSS DIFFERENT OR UNIQUE SITES AND SERVICES.", 15));
	}
	@Test
	public void test13() {
		assertEquals(")1308( qZuR Ae pQeEqDp gAk qYuF M ZaBg qOzA", 
				PlayPass.playPass("ONCE UPON A TIME YOU DRESSED SO FINE (1968)", 12));
	}
	@Test
	public void test14() {
		assertEquals("KxQzAx eEuY ,fTsUd xXm xAaToE FeQzUr qTf aF QzAs qH'GaK ,tM", 
				PlayPass.playPass("AH, YOU'VE GONE TO THE FINEST SCHOOL ALL RIGHT, MISS LONELY", 12));
	}
	@Test
	public void test15() {
		assertEquals(".LvCwZoZmLvC BmMn 993,6 mUwA AmDqT ,lTzWeZmLvC MpB Nw lWo sMmZo mPb zMbNi lMuIv ,AmQkMxA MpB", 
				PlayPass.playPass("THE SPECIES, NAMED AFTER THE GREEK GOD OF THE UNDERWORLD, LIVES SOME 3,600 FEET UNDERGROUND.", 8));
	}
}