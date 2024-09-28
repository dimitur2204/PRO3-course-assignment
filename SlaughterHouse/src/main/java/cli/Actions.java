package cli;

import dao.IPartDao;
import dao.IRegisterDao;
import dao.RegisterDaoImpl;
import model.IRegister;
import model.Register;

import java.util.List;
import java.util.Scanner;

public class Actions {
	private final IRegisterDao registerDao;
	private IPartDao partDao;

	public Actions() {
		registerDao = new RegisterDaoImpl();
	}

	public String addRegister() {
		System.out.println("What weight is the register?");
		Double weight = null;
		try {
			Scanner scanner = new Scanner(System.in);
			weight = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			return "Invalid input! Please enter a number!";
		}
		IRegister register = new Register();
		register.setWeight(weight);
		try {
			registerDao.add(register);
			return "Register added successfully! ✅";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String getRegisters() {
		try {
			List<IRegister> list = this.registerDao.getRegisters();
			if (list.isEmpty()) {
				return "No registers found!";
			}
			StringBuilder sb = new StringBuilder();
			for (IRegister register : list) {
				sb.append("Register ID: ").append(register.getId()).append("\n");
				sb.append("Register weight: ").append(register.getWeight()).append("\n");
			}
			return sb.toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public void addPart(Register register, Double weight) {
		return;
	}
}
