package org.snaker.framework.security.dao;

import org.snaker.framework.orm.hibernate.HibernateDao;
import org.snaker.framework.security.entity.Authority;
import org.springframework.stereotype.Component;

/**
 * 权限持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class AuthorityDao extends HibernateDao<Authority, Long> {

}
