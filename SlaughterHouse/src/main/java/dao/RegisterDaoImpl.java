package dao;

import model.IRegister;
import model.Register;
import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegisterDaoImpl implements IRegisterDao {
	static Connection db = DatabaseConnection.getConnection();
	@Override
	public int add(IRegister register) throws SQLException {
		String query = "insert into register (id, weight) values (?, ?)";
		PreparedStatement stmt = db.prepareStatement(query);
		stmt.setObject(1, register.getId());
		stmt.setDouble(2, register.getWeight());
		return stmt.executeUpdate();
	}

	@Override
	public IRegister getRegister(String id) throws SQLException {
		String query = "select * from register where id = ?";
		PreparedStatement stmt = db.prepareStatement(query);
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		Register register = new Register();
		boolean check = false;
		while(rs.next()){
			check = true;
			register.setWeight(rs.getDouble("weight"));
		}
		if(check){
			return register;
		}
		return null;
	}

	@Override
	public List<IRegister> getRegisters() throws SQLException {
		String query = "select * from register";
		PreparedStatement stmt = db.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		List<IRegister> registers = new ArrayList<>();
		while(rs.next()){
			Register register = new Register();
			register.setWeight(rs.getDouble("weight"));
			registers.add(register);
		}
		return registers;
	}
}
