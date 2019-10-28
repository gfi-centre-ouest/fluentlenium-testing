import com.github.database.rider.core.api.connection.ConnectionHolder;
import com.github.database.rider.junit5.DBUnitExtension;
import org.fluentlenium.adapter.junit.jupiter.FluentTest;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.github.database.rider.core.util.EntityManagerProvider.instance;

@ExtendWith(DBUnitExtension.class)
public class RiderFluentTest extends FluentTest {
    private ConnectionHolder connectionHolder = () -> instance("riderDB").connection();
}
