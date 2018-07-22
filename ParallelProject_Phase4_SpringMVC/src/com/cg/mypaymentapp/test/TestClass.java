package com.cg.mypaymentapp.test;

public class TestClass {

//	WalletService service;
//
//	@Before
//	public void initData() {
//
//		service = new WalletServiceImpl();
//
//		
//
//	}
//
//	@AfterClass
//	public static void deleteData() {
//		EntityManager entity = JPAUtil.getEntityManager();
//		String query1 = "truncate table customer";
//		String query2 = "truncate table wallet";
//		entity.getTransaction().begin();
//		entity.createNativeQuery(query1).executeUpdate();
//		//entity.createNativeQuery(query2).executeUpdate();
//		entity.getTransaction().commit();
//
//
//	}
//
//	@Test
//	public void testCreateAccountPassed() {
//		service.createAccount("Ali", "9999999997", new BigDecimal(5000));
//		service.createAccount("Amit", "9999999998", new BigDecimal(8000));
//		service.createAccount("Ajay", "9999999999", new BigDecimal(10000));
//		Customer customer = service.createAccount("Piyush", "9999999988", new BigDecimal(0));
//		assertNotNull(customer);
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testCreateAccountFailed() {
//		Customer customer = service.createAccount(null, null, null);
//		
//
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testCreateAccountFailed1() {
//		Customer customer = service.createAccount("Anish", "9909000097", null);
//
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testCreateAccountFailed2() {
//		Customer customer = service.createAccount("anish", null, new BigDecimal(0));
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testCreateAccountFailed3() {
//		Customer customer = service.createAccount(null, "9999999999", new BigDecimal(0));
//
//	}
//
//	@Test(expected = InvalidInputException.class)
//	public void testCreateAccountFailed4() {
//		Customer customer = service.createAccount("anish", "999999999", new BigDecimal(0));
//
//	}
//
//	@Test(expected = InsufficientBalanceException.class)
//	public void testWithdraw() {
//
//		service.withdrawAmount("9999999997", new BigDecimal(8000));
//
//	}
//
//	@Test
//	public void testWithdraw1() {
//
//		service.withdrawAmount("9999999999", new BigDecimal(200));
//	}
//
//	@Test
//	public void testShowBalance() {
//
//		service.showBalance("9999999997");
//	}
//
//	@Test(expected = InvalidInputException.class)
//	public void testDeposit() {
//		service.depositAmount("9929577597", new BigDecimal(21000));
//
//	}
//
//	@Test
//	public void testDeposit1() {
//		Customer customer = service.depositAmount("9999999999", new BigDecimal(1000));
//		assertEquals(new BigDecimal(9300), customer.getWallet().getBalance());
//
//	}
//
//	@Test
//	public void testWithdraw2() {
//		Customer customer = service.withdrawAmount("9999999999", new BigDecimal(1000));
//		assertEquals(new BigDecimal(8300), customer.getWallet().getBalance());
//
//	}
//
//	@Test(expected = InvalidInputException.class)
//	public void testFundTransfer() {
//		service.fundTransfer("9929574436", "9768766349", new BigDecimal(1000));
//	}
//
//	@Test(expected = InvalidInputException.class)
//	public void testFundTransfer1() {
//		service.fundTransfer("9922950519", "9768766349", new BigDecimal(1000));
//	}
//
//	@Test(expected = InvalidInputException.class)
//	public void testFundTransfer2() {
//		service.fundTransfer("9922950519", "9922950519", new BigDecimal(1000));
//	}
//
//	@Test(expected = InsufficientBalanceException.class)
//	public void testFundTransfer3() {
//		service.fundTransfer("9999999997", "9999999998", new BigDecimal(10000));
//	}
//
//	@Test
//	public void testFundTransfer4() {
//		service.fundTransfer("9999999999", "9999999997", new BigDecimal(500));
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testFundTransfer5() {
//		service.fundTransfer(null, "9900112212", new BigDecimal(1000));
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testFundTransfer6() {
//		service.fundTransfer("9900112212", null, new BigDecimal(1000));
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testFundTransfer7() {
//		service.fundTransfer("9900112212", "9922950519", null);
//	}

}
