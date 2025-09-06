import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test {
    private static final Logger logger = LogManager.getLogger(Test.class.getName());
    public static void main(String[] args) {

        
        DatabaseConn databaseConn=new DatabaseConn();
        
        databaseConn.connect("jdbc:mysql://localhost:3306/crud?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","manisha@2004");
        
        databaseConn.crudMenu();
        
        databaseConn.closeConnection();

    }
}
