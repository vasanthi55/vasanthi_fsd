package com.project.Hibernatedemo1;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.model.OrderItem;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		
	//	Query q=session.getNamedQuery("retrieveCount");
		//q.setFetchSize(3);
	//	System.out.println(q.list());
		//refresh - changes in db will
		/*
		 * Query q1=session.getNamedQuery("retrieveall"); q1.setFirstResult(2);
		 * q1.setFetchSize(2); System.out.println(q1.list());
		 */
		//Query q=session.createQuery("retrieveall");
		//Query q=session.createSQLQuery("retrieveall");
		//System.out.println(q.list());
		
		/*Query q=session.createSQLQuery("select * from user_detail");//native qry execution
		System.out.println(q.list());
		*/
		
		/*
		 * String hql = "from OrderItem o where o.orderId =?"; Query q11 =
		 * session.createQuery(hql); q11.setParameter(0, 5); List result = q11.list();
		 * System.out.println(result);
		 * 
		 * OrderItem order=new OrderItem(); order.setOrderId(6); String hql1 =
		 * "from OrderItem o where o.orderId = :orderId"; List result1 =
		 * session.createQuery(hql1).setProperties(order).list();
		 * System.out.println(result1);
		 */
		/*
		 * Query query = session.createQuery(
		 * "from OrderItem o where o.id = :id "); query.setParameter("id", 111);
		 * List<OrderItem> list=query.list(); System.out.println(list);
		 */
		/*
		 * String qry="select order.productCount FROM OrderItem order"; Query
		 * q=session.createQuery(qry); List<OrderItem> ll=q.list();//will not
		 * class cast exception System.out.println(ll);
		 */
		
		  OrderItem order1=new OrderItem(111,5,6,8,77,788.7f);
		  session.beginTransaction(); session.save(order1);
		  session.getTransaction().commit();
		 
		session.close();
	}
}