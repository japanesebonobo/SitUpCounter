package yoshitomi.apps.situpcounter.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("counter")
public class Counter {

    @Id
    private Long id;
    private int count;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}
