package com.gqt.EmpDB;

public class MainApp {
	public static void main(String[] args) {
		Employee e = new Employee();
//		e.setEmpid(1);
//		e.setEmpname("Rahul");
//		e.setEmpaddress("Bhopal");
//		e.setEmpsalary(50000);
//		e.setEmpcompany("GQT");
		
//		e.setEmpid(2);
//		e.setEmpname("Ram");
//		e.setEmpaddress("Indore");
//		e.setEmpsalary(30000);
//		e.setEmpcompany("TCS");
		
//		e.setEmpid(3);
//		e.setEmpname("Sita");
//		e.setEmpaddress("Gwalior");
//		e.setEmpsalary(35000);
//		e.setEmpcompany("Infosys");
		
//		e.setEmpid(4);
//		e.setEmpname("Gita");
//		e.setEmpaddress("Sehore");
//		e.setEmpsalary(25000);
//		e.setEmpcompany("IBM");
		
		HibernateManager hbm = new HibernateManager();
		hbm.insertData(e);
//		hbm.selectData(e);
//		hbm.fetchAllData();
//		hbm.updateData(1, "Rohan");
//		hbm.deleteData(4);

	}
}