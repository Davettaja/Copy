package tikape.runko.database;

import java.sql.ResultSet;
import java.sql.SQLException;
 
public interface Collector {
    Object collect(ResultSet rs) throws SQLException;
}
