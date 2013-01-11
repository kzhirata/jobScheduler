package persistence

import org.mybatis.scala.config._
import org.mybatis.scala.session.Session
import play.api.Play.current
import play.api.db.DB._
import org.apache.ibatis.session.ExecutorType
import org.apache.ibatis.session.ExecutorType._

object PersistenceContext {

  //== Define mybatis session configuration ==//
  val conf = 
    Configuration(
      Environment(
        "default", 
        new ManagedTransactionFactory(),
        getDataSource()
      )
  )

  //ここにDAOとして定義するobjectを定義する。
  //== Register managed DAOs ==//
  conf ++= JobStore
  conf ++= JobConditionStore

  //== Init mybatis context ==//
  val mybatis = conf.createPersistenceContext

  //== Define a few methods to use in your Play code ==//
  
  def withConnection[A] (block: Session => A) : A = mybatis.readOnly(block)

  def withTransaction[A] (block: Session => A) : A = mybatis.transaction(block)

}
