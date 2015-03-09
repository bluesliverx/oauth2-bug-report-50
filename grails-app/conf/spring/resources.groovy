import com.example.SimpleTenantResolver
import com.example.TenantRepository

// Place your Spring DSL code here
beans = {
	tenantResolver(SimpleTenantResolver)
	tenantRepository(TenantRepository)
}
