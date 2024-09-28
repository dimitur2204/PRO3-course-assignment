package dao;

import model.IPart;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public interface IPartDao {
	public int add(IPart part) throws SQLException;
	public IPart get(UUID id) throws SQLException;
	public List<IPart> getPartsFromRegister(UUID registerId) throws SQLException;
	public List<IPart> getPartsFromTray(UUID trayId) throws SQLException;
}
