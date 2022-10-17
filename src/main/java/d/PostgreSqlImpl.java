package d;

import java.util.List;

//low-level
public class PostgreSqlImpl implements CustomerRepository{
    @Override
    public List<String> findNames() {
        return List.of("jeff", "jamal");
    }
}
