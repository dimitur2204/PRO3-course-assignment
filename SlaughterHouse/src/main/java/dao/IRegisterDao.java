package dao;

import model.IRegister;

import java.sql.SQLException;
import java.util.List;

public interface IRegisterDao {
	public int add(IRegister register) throws SQLException;
	public IRegister getRegister(String id) throws SQLException;
	public List<IRegister> getRegisters() throws SQLException;
}
