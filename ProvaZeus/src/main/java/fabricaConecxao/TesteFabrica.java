package fabricaConecxao;

import java.util.ArrayList;
import dao.GenericDao;
import entity.Usuario;
import entity.Endereco;
import entity.Filme;
import java.util.List;

public class TesteFabrica
{

  public static void main(String[] args)
  {
    
    Usuario u1 = new Usuario();
    u1.setCpf(123456);
    u1.setNome("zeus");
    u1.setSenha(123);
    Endereco ende = new Endereco();
    ende.setComp("casa");
    ende.setNomeRua("fisher");
    ende.setNum(71);
    List<Endereco> endList = new ArrayList<>();
    endList.add(ende);
    Filme f1 = new Filme();
    f1.setNomeFilme("veloz");
    f1.setAno("12/12/12");
    ArrayList<Filme> filme = new ArrayList<>();
    filme.add(f1);
    u1.setFilme(filme);
    u1.setEndereco(endList);

    GenericDao dao = new GenericDao();
    System.out.println(dao.salvar(u1));
  }
}
