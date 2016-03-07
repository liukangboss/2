
/**
 * Created by LiuKang on 2016/3/3.
 */

import com.configuration.Config;
import com.dao.UserDao;
import com.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tests {
        @Test
        public void test1(){
                ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
                SqlSessionFactory sqlSessionFactory = context.getBean(SqlSessionFactory.class);
                SqlSession sqlSession = sqlSessionFactory.openSession();
                UserDao userDao = sqlSession.getMapper(UserDao.class);

                User user = context.getBean(User.class);
                System.out.println(user);
        }

        @Test
        public void test2(){
                ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

                UserDao userDao = context.getBean(UserDao.class);
        }
}
