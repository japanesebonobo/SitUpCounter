package yoshitomi.apps.situpcounter.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CounterDataRepository {

    private final JdbcTemplate jdbcTemplate;

    public CounterDataRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int getCounter() {
        Integer count = jdbcTemplate.queryForObject(
            "SELECT count FROM counter WHERE id = 1", Integer.class);
        return count != null ? count : 0;
    }

    public void updateCounter() {
        jdbcTemplate.update("UPDATE counter SET count = count + 100 WHERE id = 1");
    }
}
