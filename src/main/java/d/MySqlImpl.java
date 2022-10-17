package d;

import java.util.List;

//low-level
public class MySqlImpl implements CustomerRepository{
    @Override
    public List<String> findNames() {
        return List.of("jeff", "jamal");
    }
}
