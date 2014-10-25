import junit.framework.Assert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Loctar on 2014/10/23.
 */
public class Test {
    private static final String PERSISTENCE_UNIT_NAME = "test";
    private static EntityManagerFactory factory;

    @org.junit.Test
    public void testAssertNotSame() {
        Assert.assertNotSame("failture: they are not same.", "a", "b");
    }

    @org.junit.Test
    public void testTest() {


        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select t from Test t");
        List<com.cn.entity.Test> todoList = q.getResultList();
        for (com.cn.entity.Test todo : todoList) {
            System.out.println(todo);
        }
        System.out.println("Size: " + todoList.size());

        // create new todo
//            em.getTransaction().begin();
//            Todo todo = new Todo();
//            todo.setSummary("This is a test");
//            todo.setDescription("This is a test");
//            em.persist(todo);
//            em.getTransaction().commit();
//
//            em.close();

    }
}
