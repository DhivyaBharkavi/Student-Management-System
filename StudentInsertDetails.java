package exercise14aug19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentInsertDetails {
public int insertOfficialDetails(Connection con,ArrayList list) throws SQLException;
public int insertPersonalDetails(Connection con,ArrayList list)throws SQLException;
}
