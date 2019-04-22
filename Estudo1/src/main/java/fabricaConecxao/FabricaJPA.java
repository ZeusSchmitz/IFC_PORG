package fabricaConecxao;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class FabricaJPA
{

  private static final String PERSISTENCE_UNIT_NAME = "Estudo1";
  private static EntityManagerFactory factory = null;

  public static EntityManagerFactory getEntityManagerFactory()
  {
    if (factory == null)
    {
      factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    return factory;
  }

  public static void shutdown()
  {
    if (factory != null)
    {
      factory.close();
    }
  }
}
