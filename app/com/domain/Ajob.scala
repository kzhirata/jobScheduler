package com.domain

import play.api.Logger

class Ajob extends Job {

  override def doJob = {
    super.doJob()
    (new JavaJobA).doJob()
  }
  
}