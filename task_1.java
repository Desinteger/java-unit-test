@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Если пользователю больше 18 лет, должно вернуться true", true, isAdult);
}
