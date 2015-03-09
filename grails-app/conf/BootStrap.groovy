import com.example.Client
import com.example.Role
import com.example.User
import com.example.UserRole

class BootStrap {

    def init = { servletContext ->
		new Client(clientId: "clientId", clientSecret: "clientSecret", scopes: ["all"],
				authorizedGrantTypes: ["password"]).save(failOnError: true)
		def user = new User(username: "admin", password: "password").save(failOnError: true)
		def role = new Role(authority: "ROLE_ADMIN").save(failOnError: true)
		UserRole.create(user, role, true)
    }
    def destroy = {
    }
}
