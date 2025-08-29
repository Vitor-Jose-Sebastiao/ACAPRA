
import Usuario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoadorService {
    private List<Usuario> usuarios = new ArrayList<>();

    public DoadorService() {
        usuarios.add(new Usuario("admin@acapra.com", "1234"));
    }

    public boolean autenticar(String email, String senha) {
        return usuarios.stream()
                .anyMatch(u -> u.getEmail().equals(email) && u.getSenha().equals(senha));
    }
}
