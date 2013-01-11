package com.domain

import play.api.Logger

trait Job {

  def doJob() = {

    Logger.info(this.getClass().getName() + " starts.")
    Thread.sleep(10000)
    Logger.info(this.getClass().getName() + " ends.")

  }  
  
}